package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.ExpensesMapper;
import com.yt.app.api.v1.service.ExpensesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Expenses;
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
public class ExpensesServiceImpl extends BaseServiceImpl<Expenses, Long> implements ExpensesService {
	@Autowired
	private ExpensesMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Expenses t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Expenses> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Expenses> list = mapper.list(param);
		long[] dids = list.stream().mapToLong(Expenses::getExpensetype).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getExpensetype().longValue() == d.getCode().longValue()) {
					t.setExpensetypename(d.getName());
					return;
				}
			});
		});
		return new PageBean<Expenses>(param, list, count);
	}

	@Override
	@Transactional
	public Integer put(Expenses t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}

	@Override
	public Expenses get(Long id) {
		Expenses t = mapper.get(id);
		t.setExpensetypename(dictionarymapper.getByCode(t.getExpensetype()).getName());
		return t;
	}
}