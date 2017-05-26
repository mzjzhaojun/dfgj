package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.OrdersMapper;
import com.yt.app.api.v1.service.OrdersService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Orders;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.NumberUtil;
import com.yt.app.frame.p.RequestUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class OrdersServiceImpl extends BaseServiceImpl<Orders, Long> implements OrdersService {
	@Autowired
	private OrdersMapper mapper;

	@Override
	@Transactional
	public Integer post(Orders t) {
		t.setCreatetime(new Date());
		t.setOrderno(NumberUtil.getOrderNo());
		Integer i = mapper.post(t);
		return i;
	}

	@Transactional
	public Long sava(Orders t) {
		t.setCreatetime(new Date());
		t.setOrderno(NumberUtil.getOrderNo());
		mapper.post(t);
		return t.getId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Orders> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Orders> list = mapper.list(param);
		return new PageBean<Orders>(param, list, count);
	}

	@Override
	public Orders get(Long id) {
		Orders t = mapper.get(id);
		return t;
	}
}