package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountrefundverifyingsMapper;
import com.yt.app.api.v1.service.AccountrefundverifyingsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountrefundverifyings;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

@Service
public class AccountrefundverifyingsServiceImpl extends BaseServiceImpl<Accountrefundverifyings, Long> implements AccountrefundverifyingsService {
	@Autowired
	private AccountrefundverifyingsMapper mapper;

	@Override
	public Integer post(Accountrefundverifyings t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Accountrefundverifyings> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Accountrefundverifyings> list = mapper.list(param);
		return new PageBean<Accountrefundverifyings>(param, list, count);
	}

	@Override
	public Accountrefundverifyings get(Long id) {
		Accountrefundverifyings t = mapper.get(id);
		return t;
	}
}