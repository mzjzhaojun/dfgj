package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachbranchperfmonthsumMapper;
import com.yt.app.api.v1.service.TeachbranchperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachbranchperfmonthsum;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

@Service
public class TeachbranchperfmonthsumServiceImpl extends BaseServiceImpl<Teachbranchperfmonthsum, Long> implements TeachbranchperfmonthsumService {
	@Autowired
	private TeachbranchperfmonthsumMapper mapper;

	@Override
	public Integer post(Teachbranchperfmonthsum t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Teachbranchperfmonthsum> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Teachbranchperfmonthsum> list = mapper.list(param);
		return new PageBean<Teachbranchperfmonthsum>(param, list, count);
	}

	@Override
	public Teachbranchperfmonthsum get(Long id) {
		Teachbranchperfmonthsum t = mapper.get(id);
		return t;
	}
}