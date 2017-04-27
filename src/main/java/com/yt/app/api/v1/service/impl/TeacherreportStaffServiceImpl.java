package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeacherreportStaffMapper;
import com.yt.app.api.v1.service.TeacherreportStaffService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.TeacherreportStaff;
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
public class TeacherreportStaffServiceImpl extends BaseServiceImpl<TeacherreportStaff, Long> implements TeacherreportStaffService {
	@Autowired
	private TeacherreportStaffMapper mapper;

	@Override
	public Integer post(TeacherreportStaff t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<TeacherreportStaff> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<TeacherreportStaff> list = mapper.list(param);
		return new PageBean<TeacherreportStaff>(param, list, count);
	}

	@Override
	public TeacherreportStaff get(Long id) {
		TeacherreportStaff t = mapper.get(id);
		return t;
	}
}