package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountchargeinvoicesMapper;
import com.yt.app.api.v1.service.AccountchargeinvoicesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountchargeinvoices;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

@Service
public class AccountchargeinvoicesServiceImpl extends BaseServiceImpl<Accountchargeinvoices, Long> implements AccountchargeinvoicesService {
	@Autowired
	private AccountchargeinvoicesMapper mapper;

	@Override
	@Transactional
	public Integer post(Accountchargeinvoices t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Accountchargeinvoices> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Accountchargeinvoices> list = mapper.list(param);
		return new PageBean<Accountchargeinvoices>(param, list, count);
	}

	@Override
	public Accountchargeinvoices get(Long id) {
		Accountchargeinvoices t = mapper.get(id);
		return t;
	}
}