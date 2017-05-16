package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.PerfindexreportMapper;
import com.yt.app.api.v1.service.PerfindexreportService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Perfindexreport;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

@Service
public class PerfindexreportServiceImpl extends BaseServiceImpl<Perfindexreport, Long> implements PerfindexreportService {
	@Autowired
	private PerfindexreportMapper mapper;

	@Override
	@Transactional
	public Integer post(Perfindexreport t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Perfindexreport> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Perfindexreport> list = mapper.list(param);
		return new PageBean<Perfindexreport>(param, list, count);
	}

	@Override
	public Perfindexreport get(Long id) {
		Perfindexreport t = mapper.get(id);
		return t;
	}
}