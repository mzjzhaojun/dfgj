package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultcountryperfmonthsumMapper;
import com.yt.app.api.v1.service.ConsultcountryperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultcountryperfmonthsum;
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
public class ConsultcountryperfmonthsumServiceImpl extends BaseServiceImpl<Consultcountryperfmonthsum, Long> implements
		ConsultcountryperfmonthsumService {
	@Autowired
	private ConsultcountryperfmonthsumMapper mapper;

	@Override
	@Transactional
	public Integer post(Consultcountryperfmonthsum t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Consultcountryperfmonthsum> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Consultcountryperfmonthsum> list = mapper.list(param);
		return new PageBean<Consultcountryperfmonthsum>(param, list, count);
	}

	@Override
	public Consultcountryperfmonthsum get(Long id) {
		Consultcountryperfmonthsum t = mapper.get(id);
		return t;
	}
}