package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.SchoolsMapper;
import com.yt.app.api.v1.service.SchoolsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Schools;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import com.yt.app.util.StreamUtil;

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
public class SchoolsServiceImpl extends BaseServiceImpl<Schools, Long> implements SchoolsService {
	@Autowired
	private SchoolsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Schools t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		return i;
	}

	@Override
	@Transactional
	public Integer put(Schools t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Schools> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Schools> list = mapper.list(param);
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Schools::getSchoolyear), list.stream().mapToLong(Schools::getSchoolrange),
						list.stream().mapToLong(Schools::getSchoolnature), list.stream().mapToLong(Schools::getSchoollevel)).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getSchoolyear().longValue() == d.getCode().longValue())
					t.setSchoolyearname(d.getName());
				if (t.getSchoolrange().longValue() == d.getCode().longValue())
					t.setSchoolrangename(d.getName());
				if (t.getSchoolnature().longValue() == d.getCode().longValue())
					t.setSchoolnaturename(d.getName());
				if (t.getSchoollevel().longValue() == d.getCode().longValue())
					t.setSchoollevelname(d.getName());
			});
		});
		return new PageBean<Schools>(param, list, count);
	}

	@Override
	public Schools get(Long id) {
		Schools t = mapper.get(id);
		long[] dids = Arrays.asList(t.getSchoolyear(), t.getSchoolrange(), t.getSchoolnature(), t.getSchoollevel()).stream()
				.mapToLong(Long::longValue).toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		listd.forEach(d -> {
			if (t.getSchoolyear().longValue() == d.getCode().longValue())
				t.setSchoolyearname(d.getName());
			if (t.getSchoolrange().longValue() == d.getCode().longValue())
				t.setSchoolrangename(d.getName());
			if (t.getSchoolnature().longValue() == d.getCode().longValue())
				t.setSchoolnaturename(d.getName());
			if (t.getSchoollevel().longValue() == d.getCode().longValue())
				t.setSchoollevelname(d.getName());
		});
		return t;
	}
}