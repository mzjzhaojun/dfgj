package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomertransferaccountsMapper;
import com.yt.app.api.v1.service.CustomertransferaccountsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customertransferaccounts;
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
public class CustomertransferaccountsServiceImpl extends BaseServiceImpl<Customertransferaccounts, Long> implements CustomertransferaccountsService {
	@Autowired
	private CustomertransferaccountsMapper mapper;

	@Override
	@Transactional
	public Integer post(Customertransferaccounts t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customertransferaccounts> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customertransferaccounts> list = mapper.list(param);
		return new PageBean<Customertransferaccounts>(param, list, count);
	}

	@Override
	public Customertransferaccounts get(Long id) {
		Customertransferaccounts t = mapper.get(id);
		return t;
	}
}