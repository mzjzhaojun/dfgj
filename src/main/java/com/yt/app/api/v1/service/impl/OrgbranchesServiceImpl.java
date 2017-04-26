package com.yt.app.api.v1.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.OrgbranchesMapper;
import com.yt.app.api.v1.mapper.OrgregionsMapper;
import com.yt.app.api.v1.service.OrgbranchesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.api.v1.entity.Orgbranches;
import com.yt.app.api.v1.entity.Orgregions;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:49
 */

@Service
public class OrgbranchesServiceImpl extends BaseServiceImpl<Orgbranches, Long> implements OrgbranchesService {
	@Autowired
	private OrgbranchesMapper mapper;
	@Autowired
	private OrgregionsMapper orgregionsmapper;

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Orgbranches> listpage(Map<String, Object> param) {
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Orgbranches> list = mapper.list(param);
		long[] rids = list.stream().mapToLong(Orgbranches::getRegionid).distinct().toArray();
		List<Orgregions> listregions = orgregionsmapper.listByArrayId(rids);
		list.forEach(b -> {
			listregions.forEach(r -> {
				if (b.getRegionid().longValue() == r.getId().longValue()) {
					b.setRegionidname(r.getRegionname());
					return;
				}
			});
		});
		return new PageBean<Orgbranches>(param, list, count);
	}

	@Override
	public Orgbranches getById(Long id) {
		Orgbranches b = mapper.get(id);
		b.setRegionidname(orgregionsmapper.get(b.getRegionid()).getRegionname());
		return b;
	}
}