package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.DebookordersMapper;
import com.yt.app.api.v1.service.DebookordersService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Debookorders;
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
public class DebookordersServiceImpl extends BaseServiceImpl<Debookorders, Long> implements DebookordersService {
	@Autowired
	private DebookordersMapper mapper;

	@Override
	@Transactional
	public Integer post(Debookorders t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Debookorders> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Debookorders> list = mapper.list(param);
		return new PageBean<Debookorders>(param, list, count);
	}

	@Override
	public Debookorders get(Long id) {
		Debookorders t = mapper.get(id);
		return t;
	}
}