package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.JobcodeMapper;
import com.yt.app.api.v1.service.JobcodeService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Jobcode;
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
 * @createdate 2017-04-27 19:22:17
 */

@Service
public class JobcodeServiceImpl extends BaseServiceImpl<Jobcode, Long> implements JobcodeService {
	@Autowired
	private JobcodeMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Jobcode t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Jobcode> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Jobcode> list = mapper.list(param);
		long[] dids = StreamUtil.concat(list.stream().mapToLong(Jobcode::getStatus), list.stream().mapToLong(Jobcode::getType)).distinct().toArray();
		List<Dictionary> listdictionary = dictionarymapper.listByArrayId(dids);
		list.stream().forEach(s -> {
			listdictionary.stream().forEach(d -> {
				if (s.getType().longValue() == d.getCode().longValue())
					s.setTypename(d.getName());
				if (s.getStatus().longValue() == d.getCode().longValue())
					s.setStatusname(d.getName());
			});
		});
		return new PageBean<Jobcode>(param, list, count);
	}

	@Override
	public Jobcode get(Long id) {
		Jobcode t = mapper.get(id);
		long[] dids = Arrays.asList(t.getType(), t.getStatus()).stream().mapToLong(Long::longValue).toArray();
		List<Dictionary> listdictionary = dictionarymapper.listByArrayId(dids);
		listdictionary.stream().forEach(d -> {
			if (t.getType().longValue() == d.getCode().longValue())
				t.setTypename(d.getName());
			if (t.getStatus().longValue() == d.getCode().longValue())
				t.setStatusname(d.getName());
		});
		return t;
	}
}