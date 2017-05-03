package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.JobsMapper;
import com.yt.app.api.v1.mapper.OrgbranchesMapper;
import com.yt.app.api.v1.mapper.OrgcampusesMapper;
import com.yt.app.api.v1.mapper.OrgstaffjobsMapper;
import com.yt.app.api.v1.service.OrgstaffjobsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Jobs;
import com.yt.app.api.v1.entity.Orgbranches;
import com.yt.app.api.v1.entity.Orgcampuses;
import com.yt.app.api.v1.entity.Orgstaffjobs;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;

import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class OrgstaffjobsServiceImpl extends BaseServiceImpl<Orgstaffjobs, Long> implements OrgstaffjobsService {
	@Autowired
	private OrgstaffjobsMapper mapper;
	@Autowired
	private OrgbranchesMapper orgbranchesmapper;
	@Autowired
	private OrgcampusesMapper orgcampusesmapper;
	@Autowired
	private JobsMapper jobsmapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer post(Orgstaffjobs t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Orgstaffjobs> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Orgstaffjobs> list = mapper.list(param);
		long[] bids = list.stream().mapToLong(Orgstaffjobs::getBranchid).distinct().toArray();
		long[] cids = list.stream().mapToLong(Orgstaffjobs::getCampusid).distinct().toArray();
		long[] dids = list.stream().mapToLong(Orgstaffjobs::getStaffjobtype).distinct().toArray();
		long[] sids = list.stream().mapToLong(Orgstaffjobs::getStaffjobid).distinct().toArray();
		List<Orgbranches> listb = orgbranchesmapper.listByArrayId(bids);
		List<Orgcampuses> listc = orgcampusesmapper.listByArrayId(cids);
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		List<Jobs> listj = jobsmapper.listByArrayId(sids);
		list.stream().forEach(t -> {
			listb.stream().forEach(b -> {
				if (t.getBranchid().longValue() == b.getId().longValue()) {
					t.setBranchidname(b.getBranchname());
					return;
				}
			});
			listc.stream().forEach(c -> {
				if (t.getCampusid().longValue() == c.getId().longValue()) {
					t.setCampusidname(c.getCampusname());
					return;
				}
			});
			listd.stream().forEach(d -> {
				if (t.getStaffjobtype().longValue() == d.getCode().longValue()) {
					t.setStaffjobtypename(d.getName());
					return;
				}
			});
			listj.stream().forEach(j -> {
				if (t.getStaffjobid().longValue() == j.getId().longValue()) {
					t.setStaffjobidname(j.getJobname());
					return;
				}
			});

		});
		return new PageBean<Orgstaffjobs>(param, list, count);
	}

	@Override
	public Orgstaffjobs get(Long id) {
		Orgstaffjobs t = mapper.get(id);
		if (t != null) {
			t.setBranchidname(orgbranchesmapper.get(t.getBranchid()).getBranchname());
			t.setCampusidname(orgcampusesmapper.get(t.getCampusid()).getCampusname());
			t.setStaffjobtypename(dictionarymapper.getByCode(t.getStaffjobtype()).getName());
			t.setStaffjobidname(jobsmapper.get(t.getStaffjobid()).getJobname());
		}
		return t;
	}

	@Override
	public Orgstaffjobs getByStaffId(Long id) {
		return mapper.getByStaffId(id);
	}
}