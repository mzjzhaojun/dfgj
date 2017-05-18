package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.ParentsMapper;
import com.yt.app.api.v1.mapper.RegionMapper;
import com.yt.app.api.v1.service.ParentsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Parents;
import com.yt.app.api.v1.entity.Region;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import com.yt.app.frame.p.StreamUtil;

import java.util.Arrays;
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
public class ParentsServiceImpl extends BaseServiceImpl<Parents, Long> implements ParentsService {
	@Autowired
	private ParentsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;
	@Autowired
	private RegionMapper regionmapper;

	@Override
	@Transactional
	public Integer post(Parents t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Parents> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Parents> list = mapper.list(param);
		long[] dids = StreamUtil
				.concat(list.stream().filter(t -> t.getGender() != null).mapToLong(Parents::getGender),
						list.stream().filter(t -> t.getIndustry() != null).mapToLong(Parents::getIndustry),
						list.stream().filter(t -> t.getCareer() != null).mapToLong(Parents::getCareer),
						list.stream().filter(t -> t.getIdtype() != null).mapToLong(Parents::getIdtype)).distinct().toArray();
		long[] rids = StreamUtil
				.concat(list.stream().filter(t -> t.getProvince() != null).mapToLong(Parents::getProvince),
						list.stream().filter(t -> t.getCity() != null).mapToLong(Parents::getCity),
						list.stream().filter(t -> t.getStreetname() != null).mapToLong(Parents::getStreetname),
						list.stream().filter(t -> t.getCounty() != null).mapToLong(Parents::getCounty)).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		List<Region> listr = regionmapper.listByArrayId(rids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getGender().longValue() == d.getCode().longValue())
					t.setGendername(d.getName());
				if (t.getIndustry().longValue() == d.getCode().longValue())
					t.setIndustryname(d.getName());
				if (t.getCareer().longValue() == d.getCode().longValue())
					t.setCareername(d.getName());
				if (t.getIdtype().longValue() == d.getCode().longValue())
					t.setIdtypename(d.getName());
			});

			listr.forEach(r -> {
				if (t.getProvince().longValue() == r.getId().longValue())
					t.setProvincename(r.getName());
				if (t.getCity().longValue() == r.getId().longValue())
					t.setCityname(r.getName());
				if (t.getCounty().longValue() == r.getId().longValue())
					t.setCountyname(r.getName());
				if (t.getStreetname().longValue() == r.getId().longValue())
					t.setStreetnamename(r.getName());
			});
		});
		return new PageBean<Parents>(param, list, count);
	}

	@Override
	public Parents get(Long id) {
		Parents t = mapper.get(id);
		long[] dids = Arrays.asList(t.getGender(), t.getIndustry(), t.getCareer(), t.getIdtype()).stream().filter(Long -> Long != null)
				.mapToLong(Long::longValue).toArray();
		long[] rids = Arrays.asList(t.getProvince(), t.getCity(), t.getCounty(), t.getCounty(),t.getStreetname()).stream().filter(Long -> Long != null)
				.mapToLong(Long::longValue).toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		List<Region> listr = regionmapper.listByArrayId(rids);
		listd.forEach(d -> {
			if (t.getGender().longValue() == d.getCode().longValue())
				t.setGendername(d.getName());
			if (t.getIndustry().longValue() == d.getCode().longValue())
				t.setIndustryname(d.getName());
			if (t.getCareer().longValue() == d.getCode().longValue())
				t.setCareername(d.getName());
			if (t.getIdtype().longValue() == d.getCode().longValue())
				t.setIdtypename(d.getName());
		});

		listr.forEach(r -> {
			if (t.getProvince().longValue() == r.getId().longValue())
				t.setProvincename(r.getName());
			if (t.getCity().longValue() == r.getId().longValue())
				t.setCityname(r.getName());
			if (t.getCounty().longValue() == r.getId().longValue())
				t.setCountyname(r.getName());
			if (t.getStreetname().longValue() == r.getId().longValue())
				t.setStreetnamename(r.getName());
		});
		return t;
	}

	@Override
	@Transactional
	public Integer put(Parents t) {
		t.setModifytime(new Date());
		return mapper.put(t);
	}
}