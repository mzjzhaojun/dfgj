package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatebranchcrmmonthsumMapper;
import com.yt.app.api.v1.service.EducatebranchcrmmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatebranchcrmmonthsum;
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
public class EducatebranchcrmmonthsumServiceImpl extends BaseServiceImpl<Educatebranchcrmmonthsum, Long> implements EducatebranchcrmmonthsumService {
	@Autowired
	private EducatebranchcrmmonthsumMapper mapper;

	@Override
	@Transactional
	public Integer post(Educatebranchcrmmonthsum t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Educatebranchcrmmonthsum> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Educatebranchcrmmonthsum> list = mapper.list(param);
		return new PageBean<Educatebranchcrmmonthsum>(param, list, count);
	}

	@Override
	public Educatebranchcrmmonthsum get(Long id) {
		Educatebranchcrmmonthsum t = mapper.get(id);
		return t;
	}
}