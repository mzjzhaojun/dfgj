package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.OrderdailyinfoMapper;
import com.yt.app.api.v1.service.OrderdailyinfoService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Orderdailyinfo;
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
public class OrderdailyinfoServiceImpl extends BaseServiceImpl<Orderdailyinfo, Long> implements OrderdailyinfoService {
	@Autowired
	private OrderdailyinfoMapper mapper;

	@Override
	@Transactional
	public Integer post(Orderdailyinfo t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Orderdailyinfo> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Orderdailyinfo> list = mapper.list(param);
		return new PageBean<Orderdailyinfo>(param, list, count);
	}

	@Override
	public Orderdailyinfo get(Long id) {
		Orderdailyinfo t = mapper.get(id);
		return t;
	}
}