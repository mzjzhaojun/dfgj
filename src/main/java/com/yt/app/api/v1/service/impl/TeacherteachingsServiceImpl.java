package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeacherteachingsMapper;
import com.yt.app.api.v1.service.TeacherteachingsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teacherteachings;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

@Service
public class TeacherteachingsServiceImpl extends BaseServiceImpl<Teacherteachings, Long> implements TeacherteachingsService {
	@Autowired
	private TeacherteachingsMapper mapper;

	@Override
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
		return new PageBean<Teacherteachings>(param, list, count);
	}

	@Override
	public Teacherteachings get(Long id) {
		Teacherteachings t = mapper.get(id);
		return t;
	}
}