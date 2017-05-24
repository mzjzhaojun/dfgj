package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.PresentitemsMapper;
import com.yt.app.api.v1.mapper.PresentsMapper;
import com.yt.app.api.v1.service.PresentitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Presentitems;
import com.yt.app.api.v1.entity.Presents;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

@Service
public class PresentitemsServiceImpl extends BaseServiceImpl<Presentitems, Long> implements PresentitemsService {
	@Autowired
	private PresentitemsMapper mapper;

	@Autowired
	private PresentsMapper presentsmapper;

	@Override
	@Transactional
	public Integer post(Presentitems t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Presentitems> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Presentitems> list = mapper.list(param);
		return new PageBean<Presentitems>(param, list, count);
	}

	@Override
	public Presentitems get(Long id) {
		Presentitems t = mapper.get(id);
		return t;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<List<Map<String, Object>>> map(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countmap(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Map<String, Object>> list = mapper.map(param);
		long[] ids = list.stream().flatMap((map) -> map.entrySet().stream()).filter(Entry -> Entry.getKey().equals("presentid"))
				.mapToLong(e -> Long.valueOf(e.getValue().toString())).toArray();
		List<Presents> listd = presentsmapper.listByArrayId(ids);
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (Map<String, Object> map : list) {
			Map<String, Object> resultmap = new HashMap<String, Object>();
			for (Map.Entry<String, Object> t : map.entrySet()) {
				resultmap.put(t.getKey(), t.getValue());
				if (t.getKey().equals("presentid")) {
					for (Presents d : listd) {
						if (t.getValue().toString().equals(d.getId().toString())) {
							resultmap.put("presentidname", d.getPresentname());
							break;
						}
					}
				}
			}
			result.add(resultmap);
		}
		return new PageBean<List<Map<String, Object>>>(param, count, result);
	}
}