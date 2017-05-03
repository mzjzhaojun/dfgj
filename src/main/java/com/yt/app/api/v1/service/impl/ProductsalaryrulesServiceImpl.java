package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.ProductsMapper;
import com.yt.app.api.v1.mapper.ProductsalaryrulesMapper;
import com.yt.app.api.v1.service.ProductsalaryrulesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Products;
import com.yt.app.api.v1.entity.Productsalaryrules;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;

import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

@Service
public class ProductsalaryrulesServiceImpl extends BaseServiceImpl<Productsalaryrules, Long> implements ProductsalaryrulesService {
	@Autowired
	private ProductsalaryrulesMapper mapper;
	@Autowired
	private ProductsMapper productsmapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Productsalaryrules t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Productsalaryrules> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Productsalaryrules> list = mapper.list(param);
		long[] pids = list.stream().mapToLong(Productsalaryrules::getProductid).distinct().toArray();
		long[] dids = list.stream().mapToLong(Productsalaryrules::getRuleobject).distinct().toArray();
		List<Products> listp = productsmapper.listByArrayId(pids);
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.forEach(t -> {
			listp.forEach(p -> {
				if (t.getProductid().longValue() == p.getId().longValue()) {
					t.setProductidname(p.getProductname());
					return;
				}
			});
			listd.forEach(d -> {
				if (t.getRuleobject().longValue() == d.getCode().longValue()) {
					t.setRuleobjectname(d.getName());
					return;
				}
			});
		});
		return new PageBean<Productsalaryrules>(param, list, count);
	}

	@Override
	public Productsalaryrules get(Long id) {
		Productsalaryrules t = mapper.get(id);
		t.setProductidname(productsmapper.get(t.getProductid()).getProductname());
		t.setRuleobjectname(dictionarymapper.getByCode(t.getRuleobject()).getName());
		return t;
	}
}