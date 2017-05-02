package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.TeacherjobsMapper;
import com.yt.app.api.v1.mapper.TeachersMapper;
import com.yt.app.api.v1.service.TeacherjobsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Teacherjobs;
import com.yt.app.api.v1.entity.Teachers;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;

import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

@Service
public class TeacherjobsServiceImpl extends BaseServiceImpl<Teacherjobs, Long> implements TeacherjobsService {
	@Autowired
	private TeacherjobsMapper mapper;
	@Autowired
	private TeachersMapper teachersmapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Teacherjobs t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Teacherjobs> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Teacherjobs> list = mapper.list(param);
		long[] tids = list.stream().mapToLong(Teacherjobs::getTeacherid).distinct().toArray();
		long[] dids = list.stream().mapToLong(Teacherjobs::getJobstatus).distinct().toArray();
		List<Teachers> listteacher = teachersmapper.listByArrayId(tids);
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.stream().forEach(t -> {
			listteacher.stream().forEach(tc -> {
				if (t.getTeacherid().longValue() == tc.getId().longValue()) {
					t.setTeacheridname(tc.getTeachername());
					return;
				}
			});
			listd.stream().forEach(d -> {
				if (t.getJobstatus().longValue() == d.getCode().longValue()) {
					t.setJobstatusname(d.getName());
					return;
				}
			});
		});
		return new PageBean<Teacherjobs>(param, list, count);
	}

	@Override
	public Teacherjobs get(Long id) {
		Teacherjobs t = mapper.get(id);
		t.setJobstatusname(dictionarymapper.getByCode(t.getJobstatus()).getName());
		t.setTeacheridname(teachersmapper.get(t.getTeacherid()).getTeachername());
		return t;
	}
}