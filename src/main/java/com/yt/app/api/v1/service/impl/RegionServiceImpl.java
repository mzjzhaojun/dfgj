package com.yt.app.api.v1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.api.v1.mapper.RegionMapper;
import com.yt.app.api.v1.service.RegionService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Region;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.frame.id.IdWorker;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-11-04 15:40:04
 */

@Service
public class RegionServiceImpl extends BaseServiceImpl<Region, Long> implements RegionService {
	@Autowired
	private RegionMapper mapper;
	@Autowired
	private IdWorker idworker;

	@Override
	public List<Region> getlist() {

		List<Region> listmeun = mapper.getlist();

		return listmeun;
	}

	@Override
	public List<Region> getlistAll() {

		int[] getint = { DictionaryResource.REGION_GRADE_2, DictionaryResource.REGION_GRADE_3, DictionaryResource.REGION_GRADE_4 };
		List<Region> listmeun = mapper.getlistAll(getint);
		return listmeun;
	}

	@Override
	public List<Region> getbyparentid(long parendid) {
		List<Region> listmeun = mapper.getbyparentid(parendid);
		return listmeun;
	}

	@Override
	public List<Region> getlistAllStyle() {
		int[] getint = { DictionaryResource.REGION_GRADE_2 };
		List<Region> listregion = mapper.getlistAll(getint);
		long[] getid = listregion.stream().mapToLong(Region::getId).distinct().toArray();
		List<Region> listparentid = mapper.getlistbyparentid(getid);
		long[] getids = listparentid.stream().mapToLong(Region::getId).distinct().toArray();
		List<Region> listqregion = mapper.getlistbyparentid(getids);

		for (int i = 0; i < listregion.size(); i++) {
			Region region = listregion.get(i);
			List<Region> list1 = new ArrayList<Region>();
			for (int n = 0; n < listparentid.size(); n++) {
				Region region2 = listparentid.get(n);
				if (region.getId().longValue() == region2.getParent_id().longValue()) {
					list1.add(region2);

				}
				List<Region> list2 = new ArrayList<Region>();
				for (int j = 0; j < listqregion.size(); j++) {
					Region region3 = listqregion.get(j);
					if (region2.getId().longValue() == region3.getParent_id().longValue()) {
						list2.add(region3);
					}
				}
				region2.setListregion(list2);
			}
			region.setListregion(list1);
		}

		return listregion;
	}

	@Override
	@Transactional
	public Integer addobject(Region param) {
		String getpath = param.getRegion_path();
		long getid = idworker.nextId();
		param.setId(getid);
		if (getpath == null) {
			param.setRegion_path("," + getid);
		} else {
			param.setRegion_path(getpath + "," + getid);
		}
		if (param.getRegion_grade().intValue() == DictionaryResource.REGION_GRADE_2.intValue()) {
			Region region = mapper.getregiongrade(DictionaryResource.REGION_GRADE_1.longValue());
			param.setParent_id(region.getId());
		}
		Integer i = mapper.post(param);
		return i;
	}

}