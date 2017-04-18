package com.yt.app.api.v1.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.api.v1.mapper.LinkMapper;
import com.yt.app.api.v1.service.LinkService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import com.yt.app.api.v1.entity.Link;

/**
 * @author ssh
 * 
 * @version v1
 * @createdate 2016-10-14 10:17:35
 */

@Service
public class LinkServiceImpl extends BaseServiceImpl<Link, Long> implements LinkService {
	@Autowired
	private LinkMapper mapper;

	@Override
	@Transactional
	public Integer add(RequestEntity<Link> requestEntity) {
		Integer count = this.mapper.countrel(requestEntity.getBody().getRel());
		if (count == 0) {
			Integer i = this.mapper.post(requestEntity.getBody());
			return i;
		} else {
			return -1;
		}
	}

	@Override
	@Transactional
	public Integer update(RequestEntity<Link> requestEntity) {
		Integer i = this.mapper.put(requestEntity.getBody());
		return i;
	}

	@Override
	@Transactional
	public Integer delete(Long id) {
		Integer i = this.mapper.delete(id);
		return i;
	}

	@Override
	public Link get(Long id) {
		Link link = this.mapper.get(id);
		return link;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Link> getlist(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (param != null && PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Link> linkList = mapper.list(param);
		return new PageBean<Link>(param, linkList, count);

	}
}