package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.PotentialcustomersMapper;
import com.yt.app.api.v1.service.PotentialcustomersService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Potentialcustomers;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import com.yt.app.util.StreamUtil;

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
public class PotentialcustomersServiceImpl extends BaseServiceImpl<Potentialcustomers, Long> implements PotentialcustomersService {
	@Autowired
	private PotentialcustomersMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;

	@Override
	@Transactional
	public Integer delete(Long id) {
		Potentialcustomers t = mapper.get(id);
		t.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1978);
		return mapper.put(t);
	}

	@Override
	@Transactional
	public Integer post(Potentialcustomers t) {
		t.setCreatetime(new Date());
		t.setNextfollowtime(new Date());
		t.setCustomerlevel(DictionaryResource.PATRIARCH_LEVEL_1951);
		t.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1971);
		t.setFollowstage(DictionaryResource.PATRIARCH_FLLOWSTATUS_571);
		t.setViptype(DictionaryResource.PATRIARCH_VIP_1993);
		t.setFollowedcount(0);
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Potentialcustomers> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Potentialcustomers> list = mapper.list(param);
		if (list.size() == 0)
			return PageBean.EMPTY_PAGE;
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Potentialcustomers::getSourcemaintype),
						list.stream().mapToLong(Potentialcustomers::getCustomerlevel),
						list.stream().mapToLong(Potentialcustomers::getCustomerstatus), list.stream().mapToLong(Potentialcustomers::getFollowstage),
						list.stream().mapToLong(Potentialcustomers::getViptype),
						list.stream().filter(t -> t.getGender() != null).mapToLong(Potentialcustomers::getGender),
						list.stream().filter(t -> t.getGrade() != null).mapToLong(Potentialcustomers::getGrade),
						list.stream().filter(t -> t.getSchoolyear() != null).mapToLong(Potentialcustomers::getSchoolyear),
						list.stream().filter(t -> t.getSubjecttype() != null).mapToLong(Potentialcustomers::getSubjecttype),
						list.stream().filter(t -> t.getStudenttype() != null).mapToLong(Potentialcustomers::getStudenttype),
						list.stream().filter(t -> t.getContacttype() != null).mapToLong(Potentialcustomers::getContacttype),
						list.stream().filter(t -> t.getPurchaseintention() != null).mapToLong(Potentialcustomers::getPurchaseintention)).distinct()
				.toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getSourcemaintype().longValue() == d.getCode().longValue())
					t.setSourcemaintypename(d.getName());
				if (t.getCustomerlevel().longValue() == d.getCode().longValue())
					t.setCustomerlevelname(d.getName());
				if (t.getCustomerstatus().longValue() == d.getCode().longValue())
					t.setCustomerstatusname(d.getName());
				if (t.getFollowstage().longValue() == d.getCode().longValue())
					t.setFollowstagename(d.getName());
				if (t.getViptype().longValue() == d.getCode().longValue())
					t.setViptypename(d.getName());
				//
				if (t.getGender() != null && t.getGender().longValue() == d.getCode().longValue())
					t.setGendername(d.getName());
				if (t.getGrade() != null && t.getGrade().longValue() == d.getCode().longValue())
					t.setGradename(d.getName());
				if (t.getSchoolyear() != null && t.getSchoolyear().longValue() == d.getCode().longValue())
					t.setSchoolyearname(d.getName());
				if (t.getSubjecttype() != null && t.getSubjecttype().longValue() == d.getCode().longValue())
					t.setSubjecttypename(d.getName());
				if (t.getStudenttype() != null && t.getStudenttype().longValue() == d.getCode().longValue())
					t.setStudenttypename(d.getName());
				if (t.getContacttype() != null && t.getContacttype().longValue() == d.getCode().longValue())
					t.setContacttypename(d.getName());
				if (t.getPurchaseintention() != null && t.getPurchaseintention().longValue() == d.getCode().longValue())
					t.setPurchaseintentionname(d.getName());
			});
		});
		return new PageBean<Potentialcustomers>(param, list, count);
	}

	@Override
	public Potentialcustomers get(Long id) {
		Potentialcustomers t = mapper.get(id);
		long[] dids = Arrays
				.asList(t.getSourcemaintype(), t.getCustomerlevel(), t.getCustomerstatus(), t.getFollowstage(), t.getViptype(), t.getGender(),
						t.getGrade(), t.getSchoolyear(), t.getSubjecttype(), t.getStudenttype(), t.getContacttype(), t.getPurchaseintention(),
						t.getViplevel(), t.getIsoneparent(), t.getIdtype(), t.getIsstudyagain(), t.getEntrancegrade()).stream()
				.filter(Long -> Long != null).mapToLong(Long::longValue).toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		listd.forEach(d -> {
			if (t.getSourcemaintype().longValue() == d.getCode().longValue())
				t.setSourcemaintypename(d.getName());
			if (t.getCustomerlevel().longValue() == d.getCode().longValue())
				t.setCustomerlevelname(d.getName());
			if (t.getCustomerstatus().longValue() == d.getCode().longValue())
				t.setCustomerstatusname(d.getName());
			if (t.getFollowstage().longValue() == d.getCode().longValue())
				t.setFollowstagename(d.getName());
			if (t.getViptype().longValue() == d.getCode().longValue())
				t.setViptypename(d.getName());
			//
			if (t.getGender() != null && t.getGender().longValue() == d.getCode().longValue())
				t.setGendername(d.getName());
			if (t.getGrade() != null && t.getGrade().longValue() == d.getCode().longValue())
				t.setGradename(d.getName());
			if (t.getSchoolyear() != null && t.getSchoolyear().longValue() == d.getCode().longValue())
				t.setSchoolyearname(d.getName());
			if (t.getSubjecttype() != null && t.getSubjecttype().longValue() == d.getCode().longValue())
				t.setSubjecttypename(d.getName());
			if (t.getStudenttype() != null && t.getStudenttype().longValue() == d.getCode().longValue())
				t.setStudenttypename(d.getName());
			if (t.getContacttype() != null && t.getContacttype().longValue() == d.getCode().longValue())
				t.setContacttypename(d.getName());
			if (t.getPurchaseintention() != null && t.getPurchaseintention().longValue() == d.getCode().longValue())
				t.setPurchaseintentionname(d.getName());

			if (t.getViplevel() != null && t.getViplevel().longValue() == d.getCode().longValue())
				t.setViplevelname(d.getName());
			if (t.getIsoneparent() != null && t.getIsoneparent().longValue() == d.getCode().longValue())
				t.setIsoneparentname(d.getName());
			if (t.getIdtype() != null && t.getIdtype().longValue() == d.getCode().longValue())
				t.setIdtypename(d.getName());
			if (t.getIsstudyagain() != null && t.getIsstudyagain().longValue() == d.getCode().longValue())
				t.setIsstudyagainname(d.getName());
			if (t.getEntrancegrade() != null && t.getEntrancegrade().longValue() == d.getCode().longValue())
				t.setEntrancegradename(d.getName());
		});
		return t;
	}
}