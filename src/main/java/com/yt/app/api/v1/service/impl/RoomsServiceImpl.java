package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.RoomsMapper;
import com.yt.app.api.v1.service.RoomsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Rooms;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

@Service
public class RoomsServiceImpl extends BaseServiceImpl<Rooms, Long> implements RoomsService {
	@Autowired
	private RoomsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Rooms t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		return i;
	}

	@Override
	@Transactional
	public Integer put(Rooms t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Rooms> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Rooms> list = mapper.list(param);
		long[] dids = list.stream().mapToLong(Rooms::getRoomstatus).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getRoomstatus().longValue() == d.getCode().longValue()) {
					t.setRoomstatusname(d.getName());
					return;
				}
			});
		});
		return new PageBean<Rooms>(param, list, count);
	}

	@Override
	public Rooms get(Long id) {
		Rooms t = mapper.get(id);
		t.setRoomstatusname(dictionarymapper.getByCode(t.getRoomstatus()).getName());
		return t;
	}
}