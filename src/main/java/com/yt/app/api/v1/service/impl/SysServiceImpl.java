package com.yt.app.api.v1.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.SysMapper;
import com.yt.app.api.v1.service.SysService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Sys;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

@Service
public class SysServiceImpl extends BaseServiceImpl<Sys, Long> implements SysService {
	@Autowired
	private SysMapper mapper;
	@Autowired
	private DictionaryMapper dmapper;

	@Override
	public List<Sys> listSys() {
		List<Sys> listsys = mapper.listlevel(DictionaryResource.SYS_LEVEL_32.intValue());
		return listsys;
	}

	@Override
	public List<Sys> listSyslevel() {
		List<Sys> listsys = mapper.listlevel(DictionaryResource.SYS_LEVEL_31.intValue());
		return listsys;
	}

	@Override
	@Transactional
	public Integer addSys(Sys sys) {
		if (sys.getParent_id() == null) {
			List<Sys> listsys = mapper.listlevel(0);
			if (listsys.size() > 0) {
				Sys getsys = listsys.get(0);
				sys.setParent_id(getsys.getId());
			}
		}
		Integer i = mapper.post(sys);
		return i;
	}

	@Override
	public Map<String, Object> getid(long id) {
		Sys sys = mapper.get(id);
		List<Sys> listsys = mapper.listlevel(sys.getLevel().intValue() - 1); // 获取父级系统数据
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sys", sys);
		map.put("listsys", listsys);
		return map;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Sys> getlist(Map<String, Object> param) {
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Sys> listsys = mapper.list(param);
		for (Sys sys : listsys) {
			if (sys.getLevel().intValue() == DictionaryResource.SYS_LEVEL_31.intValue()) {
				sys.setLevelname(DictionaryResource.SYS_LEVEL_11);
			} else if (sys.getLevel().intValue() == DictionaryResource.SYS_LEVEL_32.intValue()) {
				sys.setLevelname(DictionaryResource.SYS_LEVEL_22);
			}

		}
		return new PageBean<Sys>(param, listsys, count);
	}

	@Override
	public List<Dictionary> syslevel() {
		long[] code = { DictionaryResource.SYS_LEVEL_31.longValue(), DictionaryResource.SYS_LEVEL_32.longValue() };
		List<Dictionary> listdic = dmapper.listByArrayId(code);
		return listdic;
	}
}