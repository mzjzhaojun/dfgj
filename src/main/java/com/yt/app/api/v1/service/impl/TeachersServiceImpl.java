package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.AccountMapper;
import com.yt.app.api.v1.mapper.AccountRoleMapper;
import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.TeachersMapper;
import com.yt.app.api.v1.service.TeachersService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.api.v1.entity.Account;
import com.yt.app.api.v1.entity.AccountRole;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Teachers;
import com.yt.app.frame.d.Ah;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.DateTimeUtil;
import com.yt.app.frame.p.RequestUtil;
import com.yt.app.frame.p.StreamUtil;

import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

@Service
public class TeachersServiceImpl extends BaseServiceImpl<Teachers, Long> implements TeachersService {
	@Autowired
	private TeachersMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;
	@Autowired
	private AccountMapper accountmapper;
	@Autowired
	private Ah passwordencoders;
	@Autowired
	private AccountRoleMapper accountrolemapper;

	@Override
	@Transactional
	public Integer post(Teachers t) {
		t.setStatus(DictionaryResource.STATUS_1841);
		Integer i = mapper.post(t);
		if (i > 0) {
			Account a = new Account();
			a.setDeletestatus(DictionaryResource.USER_STATUS_1);
			a.setPsw(passwordencoders.encode("888888"));
			a.setAccount(t.getTeacheroacode());
			a.setStaffid(t.getId());
			a.setMobile(t.getMp().toString());
			a.setMail(t.getMail());
			a.setCreate_time(DateTimeUtil.getDateTime());
			a.setName(t.getTeachername());
			a.setCard_id(t.getIdnumber());
			a.setType(DictionaryResource.ACCOUNT_TYPE_10);
			i = accountmapper.post(a);
			if (i > 0) {
				AccountRole accountr = new AccountRole();
				accountr.setRole_id(857549673261568000L);
				accountr.setAccount_id(a.getId());
				i = accountrolemapper.post(accountr);
			}
		}
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Teachers> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Teachers> list = mapper.list(param);
		long[] dids = StreamUtil.concat(list.stream().mapToLong(Teachers::getGender), list.stream().mapToLong(Teachers::getStatus)).distinct()
				.toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.stream().forEach(t -> {
			listd.stream().forEach(d -> {
				if (t.getGender().longValue() == d.getCode().longValue()) {
					t.setGendername(d.getName());
					return;
				}
				if (t.getStatus().longValue() == d.getCode().longValue()) {
					t.setStatusname(d.getName());
					return;
				}
			});
		});
		return new PageBean<Teachers>(param, list, count);
	}

	@Override
	public Teachers get(Long id) {
		Teachers t = mapper.get(id);
		t.setGendername(dictionarymapper.getByCode(t.getGender()).getName());
		t.setStatusname(dictionarymapper.getByCode(t.getStatus()).getName());
		return t;
	}
}