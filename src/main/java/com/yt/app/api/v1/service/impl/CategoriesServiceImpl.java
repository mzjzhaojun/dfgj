package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.CategoriesMapper;
import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.service.CategoriesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Categories;
import com.yt.app.api.v1.entity.Dictionary;
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
 * @createdate 2017-04-27 19:22:18
 */

@Service
public class CategoriesServiceImpl extends BaseServiceImpl<Categories, Long> implements CategoriesService {
	@Autowired
	private CategoriesMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Categories t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		return i;
	}

	@Override
	@Transactional
	public Integer put(Categories t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Categories> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Categories> list = mapper.list(param);
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Categories::getCategorytype), list.stream().mapToLong(Categories::getHascourse),
						list.stream().mapToLong(Categories::getCaninput), list.stream().mapToLong(Categories::getEnabled)).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getCategorytype().longValue() == d.getCode().longValue())
					t.setCategorytypename(d.getName());
				if (t.getHascourse().longValue() == d.getCode().longValue())
					t.setHascoursename(d.getName());
				if (t.getCaninput().longValue() == d.getCode().longValue())
					t.setCaninputname(d.getName());
				if (t.getEnabled().longValue() == d.getCode().longValue())
					t.setEnabledname(d.getName());
			});
		});
		return new PageBean<Categories>(param, list, count);
	}

	@Override
	public Categories get(Long id) {
		Categories t = mapper.get(id);
		long[] dids = Arrays.asList(t.getCategorytype(), t.getHascourse(), t.getCaninput(), t.getEnabled()).stream().mapToLong(Long::longValue)
				.toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		listd.forEach(d -> {
			if (t.getCategorytype().longValue() == d.getCode().longValue())
				t.setCategorytypename(d.getName());
			if (t.getHascourse().longValue() == d.getCode().longValue())
				t.setHascoursename(d.getName());
			if (t.getCaninput().longValue() == d.getCode().longValue())
				t.setCaninputname(d.getName());
			if (t.getEnabled().longValue() == d.getCode().longValue())
				t.setEnabledname(d.getName());
		});
		return t;
	}
}