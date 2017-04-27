package com.yt.app.api.v1.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.StaffsMapper;
import com.yt.app.api.v1.service.StaffsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import com.yt.app.util.StreamUtil;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Staffs;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:57
 */

@Service
public class StaffsServiceImpl extends BaseServiceImpl<Staffs, Long> implements StaffsService {
	@Autowired
	private StaffsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	public Integer post(Staffs t) {
		t.setStatus(DictionaryResource.STATUS_571);
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Staffs> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Staffs> list = mapper.list(param);
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Staffs::getGender), list.stream().mapToLong(Staffs::getIdtype),
						list.stream().mapToLong(Staffs::getIsfulltime), list.stream().mapToLong(Staffs::getStatus)).distinct().toArray();
		List<Dictionary> listdictionary = dictionarymapper.listByArrayId(dids);
		list.stream().forEach(s -> {
			listdictionary.stream().forEach(d -> {
				if (s.getGender().longValue() == d.getCode().longValue())
					s.setGendername(d.getName());
				if (s.getIdtype().longValue() == d.getCode().longValue())
					s.setIdtypename(d.getName());
				if (s.getIsfulltime().longValue() == d.getCode().longValue())
					s.setIsfulltimename(d.getName());
				if (s.getStatus().longValue() == d.getCode().longValue())
					s.setStatusname(d.getName());
			});
		});
		return new PageBean<Staffs>(param, list, count);
	}

	@Override
	public Staffs get(Long id) {
		Staffs t = mapper.get(id);
		long[] dids = Arrays.asList(t.getGender(), t.getIdtype(), t.getIsfulltime(), t.getStatus()).stream().mapToLong(Long::longValue).toArray();
		List<Dictionary> listdictionary = dictionarymapper.listByArrayId(dids);
		listdictionary.stream().forEach(d -> {
			if (t.getGender().longValue() == d.getCode().longValue())
				t.setGendername(d.getName());
			if (t.getIdtype().longValue() == d.getCode().longValue())
				t.setIdtypename(d.getName());
			if (t.getIsfulltime().longValue() == d.getCode().longValue())
				t.setIsfulltimename(d.getName());
			if (t.getStatus().longValue() == d.getCode().longValue())
				t.setStatusname(d.getName());
		});
		return t;
	}
}