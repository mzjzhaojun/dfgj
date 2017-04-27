package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerscoreitemsMapper;
import com.yt.app.api.v1.service.CustomerscoreitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerscoreitems;
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
public class CustomerscoreitemsServiceImpl extends BaseServiceImpl<Customerscoreitems, Long> implements CustomerscoreitemsService {
	@Autowired
	private CustomerscoreitemsMapper mapper;

	@Override
	@Transactional
	public Integer post(Customerscoreitems t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customerscoreitems> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customerscoreitems> list = mapper.list(param);
		return new PageBean<Customerscoreitems>(param, list, count);
	}

	@Override
	public Customerscoreitems get(Long id) {
		Customerscoreitems t = mapper.get(id);
		return t;
	}
}