package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DiscountitemsMapper;
import com.yt.app.api.v1.mapper.DiscountsMapper;
import com.yt.app.api.v1.service.DiscountitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Discountitems;
import com.yt.app.api.v1.entity.Discounts;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class DiscountitemsServiceImpl extends BaseServiceImpl<Discountitems, Long> implements DiscountitemsService {
	@Autowired
	private DiscountitemsMapper mapper;

	@Autowired
	private DiscountsMapper discountsmapperr;

	@Override
	@Transactional
	public Integer post(Discountitems t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Discountitems> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Discountitems> list = mapper.list(param);
		return new PageBean<Discountitems>(param, list, count);
	}

	@Override
	public Discountitems get(Long id) {
		Discountitems t = mapper.get(id);
		return t;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<List<Map<String, Object>>> map(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countmap(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Map<String, Object>> list = mapper.map(param);
		long[] ids = list.stream().flatMap((map) -> map.entrySet().stream()).filter(Entry -> Entry.getKey().equals("discountid"))
				.mapToLong(e -> Long.valueOf(e.getValue().toString())).toArray();
		List<Discounts> listd = discountsmapperr.listByArrayId(ids);
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (Map<String, Object> map : list) {
			Map<String, Object> resultmap = new HashMap<String, Object>();
			for (Map.Entry<String, Object> t : map.entrySet()) {
				resultmap.put(t.getKey(), t.getValue());
				if (t.getKey().equals("discountid")) {
					for (Discounts d : listd) {
						if (t.getValue().toString().equals(d.getId().toString())) {
							resultmap.put("discountname", d.getDiscountname());
							break;
						}
					}
				}
			}
			result.add(resultmap);
		}
		return new PageBean<List<Map<String, Object>>>(param, count, result);
	}
}