package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.AccountsMapper;
import com.yt.app.api.v1.mapper.CustomerMapper;
import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.StaffsMapper;
import com.yt.app.api.v1.service.CustomerService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.api.v1.entity.Accounts;
import com.yt.app.api.v1.entity.Customer;
import com.yt.app.api.v1.entity.Dictionary;
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
 * @createdate 2017-04-27 19:22:18
 */

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, Long> implements CustomerService {
	@Autowired
	private CustomerMapper mapper;

	@Autowired
	private DictionaryMapper dictionarymapper;

	@Autowired
	private StaffsMapper staffsmapper;

	@Autowired
	private AccountsMapper accountsmapper;

	@Override
	@Transactional
	public Integer delete(Long id) {
		Customer t = mapper.get(id);
		t.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1978);
		return mapper.put(t);
	}

	@Override
	@Transactional
	public Integer post(Customer t) {
		t.setCreatetime(new Date());
		t.setModifytime(new Date());
		t.setCustomerlevel(DictionaryResource.PATRIARCH_LEVEL_1951);
		t.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1974);
		t.setFollowstage(DictionaryResource.PATRIARCH_FLLOWSTATUS_571);
		t.setViptype(DictionaryResource.PATRIARCH_VIP_1993);
		t.setFollowedcount(0);
		Integer i = mapper.post(t);
		if (i > 0) {
			Accounts ac = new Accounts();
			ac.setCustomerid(t.getId());
			ac.setAccountmoney(0);
			ac.setCreatorid(t.getCreatorid());
			ac.setCreatetime(new Date());
			ac.setCreatorname(t.getCreatorname());
			accountsmapper.post(ac);
		}
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customer> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customer> list = mapper.list(param);
		if (list.size() == 0)
			return PageBean.EMPTY_PAGE;
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Customer::getSourcemaintype), list.stream().mapToLong(Customer::getCustomerlevel),
						list.stream().mapToLong(Customer::getCustomerstatus), list.stream().mapToLong(Customer::getFollowstage),
						list.stream().mapToLong(Customer::getViptype),
						list.stream().filter(t -> t.getGender() != null).mapToLong(Customer::getGender),
						list.stream().filter(t -> t.getGrade() != null).mapToLong(Customer::getGrade),
						list.stream().filter(t -> t.getSchoolyear() != null).mapToLong(Customer::getSchoolyear),
						list.stream().filter(t -> t.getSubjecttype() != null).mapToLong(Customer::getSubjecttype),
						list.stream().filter(t -> t.getStudenttype() != null).mapToLong(Customer::getStudenttype),
						list.stream().filter(t -> t.getContacttype() != null).mapToLong(Customer::getContacttype),
						list.stream().filter(t -> t.getPurchaseintention() != null).mapToLong(Customer::getPurchaseintention)).distinct().toArray();
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
		return new PageBean<Customer>(param, list, count);
	}

	@Override
	public Customer get(Long id) {
		Customer t = mapper.get(id);
		long[] dids = Arrays
				.asList(t.getSourcemaintype(), t.getCustomerlevel(), t.getCustomerstatus(), t.getFollowstage(), t.getViptype(), t.getGender(),
						t.getGrade(), t.getSchoolyear(), t.getSubjecttype(), t.getStudenttype(), t.getContacttype(), t.getPurchaseintention(),
						t.getViplevel(), t.getIsoneparent(), t.getIdtype(), t.getIsstudyagain(), t.getEntrancegrade(), t.getInvalidreason()).stream()
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
			if (t.getInvalidreason() != null && t.getInvalidreason().longValue() == d.getCode().longValue())
				t.setInvalidreasonname(d.getName());
		});
		return t;
	}

	@Override
	public Customer sava(Customer t) {
		t.setCreatetime(new Date());
		t.setModifytime(new Date());
		t.setCustomerlevel(DictionaryResource.PATRIARCH_LEVEL_1951);
		t.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1974);
		t.setFollowstage(DictionaryResource.PATRIARCH_FLLOWSTATUS_571);
		t.setViptype(DictionaryResource.PATRIARCH_VIP_1993);
		t.setFollowedcount(0);
		Integer i = mapper.post(t);
		if (i > 0) {
			Accounts ac = new Accounts();
			ac.setCustomerid(t.getId());
			ac.setAccountmoney(0);
			ac.setCreatorid(t.getCreatorid());
			ac.setCreatetime(new Date());
			ac.setCreatorname(t.getCreatorname());
			accountsmapper.post(ac);
		}
		return this.get(t.getId());
	}
}