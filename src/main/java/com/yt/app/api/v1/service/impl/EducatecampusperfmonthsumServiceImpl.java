package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatecampusperfmonthsumMapper;
import com.yt.app.api.v1.service.EducatecampusperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatecampusperfmonthsum;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class EducatecampusperfmonthsumServiceImpl extends BaseServiceImpl<Educatecampusperfmonthsum, Long> implements
		EducatecampusperfmonthsumService {
	@Autowired
	private EducatecampusperfmonthsumMapper mapper;

	@Override
	@Transactional
	public Integer post(Educatecampusperfmonthsum t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Educatecampusperfmonthsum> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Educatecampusperfmonthsum> list = mapper.list(param);
		return new PageBean<Educatecampusperfmonthsum>(param, list, count);
	}

	@Override
	public Educatecampusperfmonthsum get(Long id) {
		Educatecampusperfmonthsum t = mapper.get(id);
		return t;
	}
}