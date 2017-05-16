package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusassetsdetailMapper;
import com.yt.app.api.v1.service.CampusassetsdetailService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Campusassetsdetail;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

@Service
public class CampusassetsdetailServiceImpl extends BaseServiceImpl<Campusassetsdetail, Long> implements CampusassetsdetailService {
	@Autowired
	private CampusassetsdetailMapper mapper;

	@Override
	@Transactional
	public Integer post(Campusassetsdetail t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Campusassetsdetail> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Campusassetsdetail> list = mapper.list(param);
		return new PageBean<Campusassetsdetail>(param, list, count);
	}

	@Override
	public Campusassetsdetail get(Long id) {
		Campusassetsdetail t = mapper.get(id);
		return t;
	}
}