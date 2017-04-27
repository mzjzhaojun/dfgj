package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.UserTaskcategoryMapper;
import com.yt.app.api.v1.service.UserTaskcategoryService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.UserTaskcategory;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

@Service
public class UserTaskcategoryServiceImpl extends BaseServiceImpl<UserTaskcategory, Long> implements UserTaskcategoryService {
	@Autowired
	private UserTaskcategoryMapper mapper;

	@Override
	public Integer post(UserTaskcategory t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<UserTaskcategory> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<UserTaskcategory> list = mapper.list(param);
		return new PageBean<UserTaskcategory>(param, list, count);
	}

	@Override
	public UserTaskcategory get(Long id) {
		UserTaskcategory t = mapper.get(id);
		return t;
	}
}