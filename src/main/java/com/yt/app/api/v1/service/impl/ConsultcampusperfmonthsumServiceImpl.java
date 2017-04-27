package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultcampusperfmonthsumMapper;
import com.yt.app.api.v1.service.ConsultcampusperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultcampusperfmonthsum;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

@Service
public class ConsultcampusperfmonthsumServiceImpl extends BaseServiceImpl<Consultcampusperfmonthsum, Long> implements
		ConsultcampusperfmonthsumService {
	@Autowired
	private ConsultcampusperfmonthsumMapper mapper;

	@Override
	@Transactional
	public Integer post(Consultcampusperfmonthsum t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Consultcampusperfmonthsum> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Consultcampusperfmonthsum> list = mapper.list(param);
		return new PageBean<Consultcampusperfmonthsum>(param, list, count);
	}

	@Override
	public Consultcampusperfmonthsum get(Long id) {
		Consultcampusperfmonthsum t = mapper.get(id);
		return t;
	}
}