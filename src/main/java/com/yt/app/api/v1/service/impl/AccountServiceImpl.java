package com.yt.app.api.v1.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.api.v1.mapper.AccountMapper;
import com.yt.app.api.v1.mapper.AccountRoleMapper;
import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.RoleMapper;
import com.yt.app.api.v1.mapper.StaffsMapper;
import com.yt.app.api.v1.mapper.TeachersMapper;
import com.yt.app.api.v1.service.AccountService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.frame.d.Ah;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.api.v1.entity.Account;
import com.yt.app.api.v1.entity.AccountRole;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Role;
import com.yt.app.api.v1.entity.Staffs;
import com.yt.app.api.v1.entity.Teachers;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-27 17:32:56
 */

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account, Long> implements AccountService {
	@Autowired
	private AccountMapper mapper;
	@Autowired
	private AccountRoleMapper armapper;
	@Autowired
	private RoleMapper rmapper;

	@Autowired
	private Ah passwordencoders;

	@Autowired
	private DictionaryMapper dmapper;
	@Autowired
	private StaffsMapper staffsmapper;
	@Autowired
	private TeachersMapper teachersmapper;

	@Override
	public Account getAccountByName(String account) {
		return mapper.getAccountByName(account);
	}

	@Override
	@Transactional
	public Integer addobject(Account param) {
		param.setDeletestatus(DictionaryResource.USER_STATUS_1);
		param.setPsw(passwordencoders.encode(param.getPsw()));
		Integer i = mapper.post(param);
		AccountRole accountr = new AccountRole();
		accountr.setRole_id(param.getRoleid());
		accountr.setAccount_id(param.getId());
		armapper.post(accountr);
		return i;
	}

	@Override
	@Transactional
	public Integer deletebyid(long id) {
		Account account = mapper.get(id);
		account.setDeletestatus(DictionaryResource.USER_STATUS_0);
		Integer i = mapper.put(account);
		armapper.deletebyaccountid(id);
		if (account.getType().longValue() == DictionaryResource.ACCOUNT_TYPE_10) {
			Staffs s = staffsmapper.get(account.getStaffid());
			s.setStatus(DictionaryResource.STATUS_1842);
			i = staffsmapper.put(s);
		} else {
			Teachers t = teachersmapper.get(account.getStaffid());
			t.setStatus(DictionaryResource.STATUS_1842);
			i = teachersmapper.put(t);
		}
		return i;
	}

	@Override
	public Account getById(long id) {
		Account account = mapper.get(id);
		AccountRole accountrole = armapper.getbyaccountid(id);
		if (accountrole != null) {
			Role role = rmapper.get(accountrole.getRole_id());
			account.setRolename(role.getName());
		}
		return account;
	}

	@Override
	@Transactional
	public Integer updatebyid(Account param) {
		if (param.getPsw() != null) {
			param.setPsw(passwordencoders.encode(param.getPsw()));
		}
		Integer i = mapper.put(param);
		AccountRole getarole = armapper.getbyaccountid(param.getId());
		AccountRole accountr = new AccountRole();
		accountr.setRole_id(param.getRoleid());
		accountr.setAccount_id(param.getId());
		if (getarole != null) {
			armapper.put(accountr);
		} else {
			armapper.post(accountr);
		}
		return i;
	}

	@Override
	public List<Dictionary> getlistaccount() {
		List<Dictionary> list = dmapper.getByTypeCode(DictionaryResource.ACCOUNT_TYPE_10);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Account> getlist(Map<String, Object> param) {
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Account> listaccount = mapper.list(param);
		if (listaccount.size() > 0) {
			long[] type = listaccount.stream().mapToLong(Account::getType).distinct().toArray();
			List<Dictionary> listdict = dmapper.listByArrayId(type);
			listaccount.stream().forEach(Account -> {
				listdict.stream().forEach(Dictionary -> {
					if (Account.getType().longValue() == Dictionary.getCode().longValue()) {
						Account.setTypename(Dictionary.getName());
					}
				});
			});
		}
		return new PageBean<Account>(param, listaccount, count);
	}
}