package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.TeacherteachingsMapper;
import com.yt.app.api.v1.service.TeacherteachingsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Teacherteachings;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import com.yt.app.frame.p.StreamUtil;

import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

@Service
public class TeacherteachingsServiceImpl extends BaseServiceImpl<Teacherteachings, Long> implements TeacherteachingsService {
	@Autowired
	private TeacherteachingsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Teacherteachings t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Teacherteachings> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Teacherteachings> list = mapper.list(param);
		long[] dids = StreamUtil.concat(list.stream().mapToLong(Teacherteachings::getGrade), list.stream().mapToLong(Teacherteachings::getSubject))
				.distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.stream().forEach(t -> {
			listd.stream().forEach(d -> {
				if (t.getGrade().longValue() == d.getCode().longValue())
					t.setGradename(d.getName());
				if (t.getSubject().longValue() == d.getCode().longValue())
					t.setSubjectname(d.getName());
			});
		});
		return new PageBean<Teacherteachings>(param, list, count);
	}

	@Override
	public Teacherteachings get(Long id) {
		Teacherteachings t = mapper.get(id);
		t.setGradename(dictionarymapper.getByCode(t.getGrade()).getName());
		t.setSubjectname(dictionarymapper.getByCode(t.getSubject()).getName());
		return t;
	}
}