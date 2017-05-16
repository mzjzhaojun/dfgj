package com.yt.app.api.v1.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.OrgbranchesMapper;
import com.yt.app.api.v1.mapper.OrgcampusesMapper;
import com.yt.app.api.v1.mapper.OrgregionsMapper;
import com.yt.app.api.v1.service.OrgcampusesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.api.v1.entity.Orgbranches;
import com.yt.app.api.v1.entity.Orgcampuses;
import com.yt.app.api.v1.entity.Orgregions;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:49
 */

@Service
public class OrgcampusesServiceImpl extends BaseServiceImpl<Orgcampuses, Long> implements OrgcampusesService {
	@Autowired
	private OrgcampusesMapper mapper;
	@Autowired
	private OrgbranchesMapper orgbranchesmapper;
	@Autowired
	private OrgregionsMapper orgregionsmapper;

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Orgcampuses> listpage(Map<String, Object> param) {
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Orgcampuses> list = mapper.list(param);
		long[] rids = list.stream().mapToLong(Orgcampuses::getRegionid).distinct().toArray();
		long[] bids = list.stream().mapToLong(Orgcampuses::getBranchid).distinct().toArray();
		List<Orgregions> listregions = orgregionsmapper.listByArrayId(rids);
		List<Orgbranches> listbranches = orgbranchesmapper.listByArrayId(bids);
		list.forEach(b -> {
			listregions.forEach(r -> {
				if (b.getRegionid().longValue() == r.getId().longValue()) {
					b.setRegionidname(r.getRegionname());
					return;
				}
			});
			listbranches.forEach(bc -> {
				if (b.getBranchid().longValue() == bc.getId().longValue()) {
					b.setBranchidname(bc.getBranchname());
					return;
				}
			});
		});
		return new PageBean<Orgcampuses>(param, list, count);
	}

	@Override
	public Orgcampuses getById(Long id) {
		Orgcampuses c = mapper.get(id);
		c.setBranchidname(orgbranchesmapper.get(c.getBranchid()).getBranchname());
		c.setRegionidname(orgregionsmapper.get(c.getRegionid()).getRegionname());
		return c;
	}

}