package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.StaffrefundstatMapper;
import com.yt.app.api.v1.service.StaffrefundstatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Staffrefundstat;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

@Service
public class StaffrefundstatServiceImpl extends BaseServiceImpl<Staffrefundstat, Long> implements StaffrefundstatService {
	@Autowired
	private StaffrefundstatMapper mapper;

	@Override
	@Transactional
	public Integer post(Staffrefundstat t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Staffrefundstat> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Staffrefundstat> list = mapper.list(param);
		return new PageBean<Staffrefundstat>(param, list, count);
	}

	@Override
	public Staffrefundstat get(Long id) {
		Staffrefundstat t = mapper.get(id);
		return t;
	}
}