package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultbranchperfdaysumMapper;
import com.yt.app.api.v1.service.ConsultbranchperfdaysumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultbranchperfdaysum;
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
public class ConsultbranchperfdaysumServiceImpl extends BaseServiceImpl<Consultbranchperfdaysum, Long> implements ConsultbranchperfdaysumService {
	@Autowired
	private ConsultbranchperfdaysumMapper mapper;

	@Override
	public Integer post(Consultbranchperfdaysum t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Consultbranchperfdaysum> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Consultbranchperfdaysum> list = mapper.list(param);
		return new PageBean<Consultbranchperfdaysum>(param, list, count);
	}

	@Override
	public Consultbranchperfdaysum get(Long id) {
		Consultbranchperfdaysum t = mapper.get(id);
		return t;
	}
}