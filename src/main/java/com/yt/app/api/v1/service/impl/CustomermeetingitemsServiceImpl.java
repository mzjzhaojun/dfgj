package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomermeetingitemsMapper;
import com.yt.app.api.v1.service.CustomermeetingitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customermeetingitems;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

@Service
public class CustomermeetingitemsServiceImpl extends BaseServiceImpl<Customermeetingitems, Long> implements CustomermeetingitemsService {
	@Autowired
	private CustomermeetingitemsMapper mapper;

	@Override
	@Transactional
	public Integer post(Customermeetingitems t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customermeetingitems> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customermeetingitems> list = mapper.list(param);
		return new PageBean<Customermeetingitems>(param, list, count);
	}

	@Override
	public Customermeetingitems get(Long id) {
		Customermeetingitems t = mapper.get(id);
		return t;
	}
}