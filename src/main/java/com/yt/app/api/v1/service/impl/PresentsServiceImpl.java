package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.PresentitemsMapper;
import com.yt.app.api.v1.mapper.PresentsMapper;
import com.yt.app.api.v1.service.PresentsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Presents;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;

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
public class PresentsServiceImpl extends BaseServiceImpl<Presents, Long> implements PresentsService {
	@Autowired
	private PresentsMapper mapper;

	@Autowired
	private PresentitemsMapper presentitemsmapper;

	@Autowired
	private DictionaryMapper DictionaryMapper;

	@Transactional
	public Long sava(Presents t) {
		t.setCreatetime(new Date());
		mapper.post(t);
		return t.getId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Presents> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Presents> list = mapper.list(param);
		long[] dids = list.stream().mapToLong(Presents::getPresentstatus).distinct().toArray();
		List<Dictionary> listd = DictionaryMapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getPresentstatus().longValue() == d.getCode().longValue()) {
					t.setPresentstatusname(d.getName());
					return;
				}
			});
		});
		return new PageBean<Presents>(param, list, count);
	}

	@Override
	public Presents get(Long id) {
		Presents t = mapper.get(id);
		t.setPresentstatusname(DictionaryMapper.getByCode(t.getPresentstatus()).getName());
		return t;
	}

	@Override
	@Transactional
	public Integer put(Presents t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}

	@Override
	@Transactional
	public Integer delete(Long id) {
		Integer i = mapper.delete(id);
		if (i > 0) {
			i = presentitemsmapper.deleteByPresentId(id);
		}
		return i;
	}
}