package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.JobcodeMapper;
import com.yt.app.api.v1.mapper.JobsMapper;
import com.yt.app.api.v1.mapper.OrganizationsMapper;
import com.yt.app.api.v1.mapper.StaffsMapper;
import com.yt.app.api.v1.service.JobsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Jobcode;
import com.yt.app.api.v1.entity.Jobs;
import com.yt.app.api.v1.entity.Organizations;
import com.yt.app.api.v1.entity.Staffs;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import com.yt.app.frame.p.StreamUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@Service
public class JobsServiceImpl extends BaseServiceImpl<Jobs, Long> implements JobsService {
	@Autowired
	private JobsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;
	@Autowired
	private JobcodeMapper jobcodemapper;
	@Autowired
	private StaffsMapper staffsmapper;
	@Autowired
	private OrganizationsMapper organizationsmapper;

	@Override
	@Transactional
	public Integer post(Jobs t) {
		t.setStatus(DictionaryResource.STATUS_1841);
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Jobs> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Jobs> list = mapper.list(param);
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Jobs::getStatus), list.stream().mapToLong(Jobs::getIsfulltime),
						list.stream().mapToLong(Jobs::getIsprimary)).distinct().toArray();
		List<Dictionary> listdictionary = dictionarymapper.listByArrayId(dids);
		long[] jids = list.stream().mapToLong(Jobs::getJobcodeid).distinct().toArray();
		long[] sids = list.stream().mapToLong(Jobs::getStaffid).distinct().toArray();
		long[] oids = list.stream().mapToLong(Jobs::getOrgid).distinct().toArray();
		List<Jobcode> listjobcode = jobcodemapper.listByArrayId(jids);
		List<Staffs> liststaffs = staffsmapper.listByArrayId(sids);
		List<Organizations> listorganizations = organizationsmapper.listByArrayId(oids);
		list.stream().forEach(t -> {
			listdictionary.stream().forEach(d -> {
				if (t.getIsprimary().longValue() == d.getCode().longValue())
					t.setIsprimaryname(d.getName());
				if (t.getIsfulltime().longValue() == d.getCode().longValue())
					t.setIsfulltimename(d.getName());
				if (t.getStatus().longValue() == d.getCode().longValue())
					t.setStatusname(d.getName());
			});
			listjobcode.stream().forEach(j -> {
				if (t.getJobcodeid().longValue() == j.getId().longValue())
					t.setJobcodeidname(j.getName());
			});
			liststaffs.stream().forEach(s -> {
				if (t.getStaffid().longValue() == s.getId().longValue())
					t.setStaffidname(s.getDisplayname());
			});
			listorganizations.stream().forEach(o -> {
				if (t.getOrgid().longValue() == o.getId().longValue())
					t.setOrgidname(o.getName());
			});
		});
		return new PageBean<Jobs>(param, list, count);
	}

	@Override
	public Jobs get(Long id) {
		Jobs t = mapper.get(id);
		long[] dids = Arrays.asList(t.getIsprimary(), t.getStatus()).stream().mapToLong(Long::longValue).toArray();
		List<Dictionary> listdictionary = dictionarymapper.listByArrayId(dids);
		listdictionary.stream().forEach(d -> {
			if (t.getIsprimary().longValue() == d.getCode().longValue())
				t.setIsprimaryname(d.getName());
			if (t.getIsfulltime().longValue() == d.getCode().longValue())
				t.setIsfulltimename(d.getName());
			if (t.getStatus().longValue() == d.getCode().longValue())
				t.setStatusname(d.getName());
		});
		t.setOrgidname(organizationsmapper.get(t.getOrgid()).getName());
		t.setStaffidname(staffsmapper.get(t.getStaffid()).getDisplayname());
		t.setJobcodeidname(jobcodemapper.get(t.getJobcodeid()).getName());
		return t;
	}
}