package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.LogSysinfoMapper;
import com.yt.app.api.v1.service.LogSysinfoService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.LogSysinfo;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class LogSysinfoServiceImpl extends BaseServiceImpl<LogSysinfo, Long> implements LogSysinfoService {
	@Autowired
	private LogSysinfoMapper mapper;

	@Override
	@Transactional
	public Integer post(LogSysinfo t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<LogSysinfo> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<LogSysinfo> list = mapper.list(param);
		return new PageBean<LogSysinfo>(param, list, count);
	}

	@Override
	public LogSysinfo get(Long id) {
		LogSysinfo t = mapper.get(id);
		return t;
	}
}