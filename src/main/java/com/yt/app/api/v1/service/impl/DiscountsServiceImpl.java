package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.DiscountitemsMapper;
import com.yt.app.api.v1.mapper.DiscountsMapper;
import com.yt.app.api.v1.service.DiscountsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Discounts;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class DiscountsServiceImpl extends BaseServiceImpl<Discounts, Long> implements DiscountsService {
	@Autowired
	private DiscountsMapper mapper;

	@Autowired
	private DiscountitemsMapper discountitemsmapper;

	@Autowired
	private DictionaryMapper DictionaryMapper;

	@Transactional
	public Long sava(Discounts t) {
		t.setCreatetime(new Date());
		mapper.post(t);
		return t.getId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Discounts> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Discounts> list = mapper.list(param);
		long[] dids = list.stream().mapToLong(Discounts::getDiscountstatus).distinct().toArray();
		List<Dictionary> listd = DictionaryMapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getDiscountstatus().longValue() == d.getCode().longValue()) {
					t.setDiscountstatusname(d.getName());
					return;
				}
			});
		});
		return new PageBean<Discounts>(param, list, count);
	}

	@Override
	public Discounts get(Long id) {
		Discounts t = mapper.get(id);
		t.setDiscountstatusname(DictionaryMapper.getByCode(t.getDiscountstatus()).getName());
		return t;
	}

	@Override
	@Transactional
	public Integer put(Discounts t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}

	@Override
	@Transactional
	public Integer delete(Long id) {
		Integer i = mapper.delete(id);
		if (i > 0) {
			i = discountitemsmapper.deleteByDiscountId(id);
		}
		return i;
	}
}