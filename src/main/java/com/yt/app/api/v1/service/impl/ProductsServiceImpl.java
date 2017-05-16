package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.CategoriesMapper;
import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.ProductsMapper;
import com.yt.app.api.v1.service.ProductsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Categories;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Products;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import com.yt.app.frame.p.StreamUtil;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

@Service
public class ProductsServiceImpl extends BaseServiceImpl<Products, Long> implements ProductsService {
	@Autowired
	private ProductsMapper mapper;
	@Autowired
	private CategoriesMapper categoriesmapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Products t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		return i;
	}

	@Override
	@Transactional
	public Integer put(Products t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Products> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Products> list = mapper.list(param);
		long[] cids = list.stream().mapToLong(Products::getCatalog).distinct().toArray();
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Products::getProductstatus), list.stream().mapToLong(Products::getSubject),
						list.stream().mapToLong(Products::getGrade), list.stream().mapToLong(Products::getYear),
						list.stream().mapToLong(Products::getSeason)).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		List<Categories> listc = categoriesmapper.listByArrayId(cids);
		list.forEach(t -> {
			listc.forEach(c -> {
				if (t.getCatalog().longValue() == c.getId().longValue()) {
					t.setCatalogname(c.getCategoryname());
					return;
				}
			});
			listd.forEach(d -> {
				if (t.getProductstatus().longValue() == d.getCode().longValue()) {
					t.setProductstatusname(d.getName());
				}
				if (t.getSubject().longValue() == d.getCode().longValue()) {
					t.setSubjectname(d.getName());
				}
				if (t.getGrade().longValue() == d.getCode().longValue()) {
					t.setGradename(d.getName());
				}
				if (t.getYear().longValue() == d.getCode().longValue()) {
					t.setYearname(d.getName());
				}
				if (t.getSeason().longValue() == d.getCode().longValue()) {
					t.setSeasonname(d.getName());
				}
			});
		});
		return new PageBean<Products>(param, list, count);
	}

	@Override
	public Products get(Long id) {
		Products t = mapper.get(id);
		long[] dids = Arrays
				.asList(t.getProductstatus(), t.getSubject(), t.getGrade(), t.getYear(), t.getSeason(), t.getSpecialallowed(), t.getTunlandallowed(),
						t.getPresentallowed(), t.getPromotionallowed()).stream().mapToLong(Long::longValue).toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		t.setCatalogname(categoriesmapper.get(t.getCatalog()).getCategoryname());
		listd.forEach(d -> {
			if (t.getProductstatus().longValue() == d.getCode().longValue()) {
				t.setProductstatusname(d.getName());
			}
			if (t.getSubject().longValue() == d.getCode().longValue()) {
				t.setSubjectname(d.getName());
			}
			if (t.getGrade().longValue() == d.getCode().longValue()) {
				t.setGradename(d.getName());
			}
			if (t.getYear().longValue() == d.getCode().longValue()) {
				t.setYearname(d.getName());
			}
			if (t.getSeason().longValue() == d.getCode().longValue()) {
				t.setSeasonname(d.getName());
			}
			if (t.getSpecialallowed().longValue() == d.getCode().longValue()) {
				t.setSpecialallowedname(d.getName());
			}
			if (t.getTunlandallowed().longValue() == d.getCode().longValue()) {
				t.setTunlandallowedname(d.getName());
			}
			if (t.getPresentallowed().longValue() == d.getCode().longValue()) {
				t.setPresentallowedname(d.getName());
			}
			if (t.getPromotionallowed().longValue() == d.getCode().longValue()) {
				t.setPromotionallowedname(d.getName());
			}
		});
		return t;
	}
}