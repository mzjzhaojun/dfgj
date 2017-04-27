package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.StaffbasestatMapper;
import com.yt.app.api.v1.service.StaffbasestatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Staffbasestat;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import java.util.List;
import java.util.Map;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

@Service
public class StaffbasestatServiceImpl extends BaseServiceImpl<Staffbasestat, Long> implements StaffbasestatService{
  @Autowired
  private StaffbasestatMapper mapper;

@Override
public Integer post(Staffbasestat t) {
	Integer i = mapper.post(t);
	return i;
}

@SuppressWarnings("unchecked")
@Override
public IPage<Staffbasestat> list(RequestEntity<Object> requestEntity) {
	Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
	int count = 0;
	if (PageBean.isPaging(param)) {
  	count = mapper.countlist(param);
 	    if (count == 0) {
			return PageBean.EMPTY_PAGE;
		}
	}
	List<Staffbasestat> list = mapper.list(param);
	return new PageBean<Staffbasestat>(param, list, count);
}

@Override
public Staffbasestat get(Long id) {
	Staffbasestat t = mapper.get(id);
	return t;
}
}