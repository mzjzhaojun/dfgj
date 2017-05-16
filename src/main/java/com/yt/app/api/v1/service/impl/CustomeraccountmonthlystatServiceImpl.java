package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomeraccountmonthlystatMapper;
import com.yt.app.api.v1.service.CustomeraccountmonthlystatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customeraccountmonthlystat;
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
public class CustomeraccountmonthlystatServiceImpl extends BaseServiceImpl<Customeraccountmonthlystat, Long> implements
		CustomeraccountmonthlystatService {
	@Autowired
	private CustomeraccountmonthlystatMapper mapper;

	@Override
	@Transactional
	public Integer post(Customeraccountmonthlystat t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customeraccountmonthlystat> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customeraccountmonthlystat> list = mapper.list(param);
		return new PageBean<Customeraccountmonthlystat>(param, list, count);
	}

	@Override
	public Customeraccountmonthlystat get(Long id) {
		Customeraccountmonthlystat t = mapper.get(id);
		return t;
	}
}