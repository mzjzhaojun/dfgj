package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerstaffrelationshipsMapper;
import com.yt.app.api.v1.service.CustomerstaffrelationshipsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerstaffrelationships;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

@Service
public class CustomerstaffrelationshipsServiceImpl extends BaseServiceImpl<Customerstaffrelationships, Long> implements
		CustomerstaffrelationshipsService {
	@Autowired
	private CustomerstaffrelationshipsMapper mapper;

	@Override
	@Transactional
	public Integer post(Customerstaffrelationships t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customerstaffrelationships> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customerstaffrelationships> list = mapper.list(param);
		return new PageBean<Customerstaffrelationships>(param, list, count);
	}

	@Override
	public Customerstaffrelationships get(Long id) {
		Customerstaffrelationships t = mapper.get(id);
		return t;
	}
}