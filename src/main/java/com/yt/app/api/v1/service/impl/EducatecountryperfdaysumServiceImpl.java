package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatecountryperfdaysumMapper;
import com.yt.app.api.v1.service.EducatecountryperfdaysumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatecountryperfdaysum;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class EducatecountryperfdaysumServiceImpl extends BaseServiceImpl<Educatecountryperfdaysum, Long> implements EducatecountryperfdaysumService {
	@Autowired
	private EducatecountryperfdaysumMapper mapper;

	@Override
	@Transactional
	public Integer post(Educatecountryperfdaysum t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Educatecountryperfdaysum> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Educatecountryperfdaysum> list = mapper.list(param);
		return new PageBean<Educatecountryperfdaysum>(param, list, count);
	}

	@Override
	public Educatecountryperfdaysum get(Long id) {
		Educatecountryperfdaysum t = mapper.get(id);
		return t;
	}
}