package com.yt.app.api.v1.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.OrganizationsMapper;
import com.yt.app.api.v1.service.OrganizationsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import com.yt.app.util.StreamUtil;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Organizations;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:48
 */

@Service
public class OrganizationsServiceImpl extends BaseServiceImpl<Organizations, Long> implements OrganizationsService {
	@Autowired
	private OrganizationsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	public Integer post(Organizations t) {
		t.setStatus(DictionaryResource.STATUS_571);
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Organizations> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Organizations> list = mapper.list(param);
		long[] dcodes = StreamUtil.concat(list.stream().mapToLong(Organizations::getOrgtype), list.stream().mapToLong(Organizations::getStatus))
				.distinct().toArray();
		List<Dictionary> listdictionary = dictionarymapper.listByArrayId(dcodes);
		list.stream().forEach(o -> {
			listdictionary.stream().forEach(d -> {
				if (o.getOrgtype().longValue() == d.getCode().longValue())
					o.setOrgtypename(d.getName());
				if (o.getStatus().longValue() == d.getCode().longValue())
					o.setStatusname(d.getName());
			});
		});
		return new PageBean<Organizations>(param, list, count);
	}

	@Override
	public Organizations get(Long id) {
		Organizations o = mapper.get(id);
		o.setStatusname(dictionarymapper.getByCode(o.getStatus()).getName());
		o.setOrgtypename(dictionarymapper.getByCode(o.getOrgtype()).getName());
		return o;
	}
}