package com.yt.app.common.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.entity.Account;
import com.yt.app.api.v1.entity.Orgcampuses;
import com.yt.app.api.v1.entity.Orgstaffjobs;
import com.yt.app.api.v1.entity.Teacherjobs;
import com.yt.app.api.v1.service.AccountService;
import com.yt.app.api.v1.service.OrgcampusesService;
import com.yt.app.api.v1.service.OrgstaffjobsService;
import com.yt.app.api.v1.service.StaffsService;
import com.yt.app.api.v1.service.TeacherjobsService;
import com.yt.app.common.resource.DictionaryResource;

/**
 * A Spring Security UserDetailsService implementation which creates UserDetails
 * objects from the Account and Role entities.
 * 
 * @author ZJ
 */
@Service
public class AccountUserDetailsService implements UserDetailsService {

	/**
	 * The AccountService business service.
	 */
	@Autowired
	private AccountService accountService;

	@Autowired
	private OrgstaffjobsService orgstaffjobsservice;

	@Autowired
	private StaffsService staffsservice;

	@Autowired
	private OrgcampusesService orgcampusesservice;

	@Autowired
	private TeacherjobsService teacherjobsservice;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountService.getAccountByName(username);
		if (account == null) {
			throw new UsernameNotFoundException("用户没有找到!");
		}
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_NAME");// 加入一个角色
		grantedAuthorities.add(grantedAuthority);
		boolean booleanenabled = true;
		boolean booleanaccountNonExpired = true;
		boolean booleancredentialsNonExpired = true;
		boolean booleanaccountNonLocked = true;
		AccountSecurityUser userDetails = new AccountSecurityUser(account.getAccount(), account.getPsw(), booleanenabled, booleanaccountNonExpired,
				booleancredentialsNonExpired, booleanaccountNonLocked, grantedAuthorities);
		userDetails.setAccountid(account.getId());
		if (account.getType().longValue() == DictionaryResource.ACCOUNT_TYPE_18) {
			userDetails.setStaffid(account.getId());
			userDetails.setStaffname("内置超级管理员");
		} else if (account.getType().longValue() == DictionaryResource.ACCOUNT_TYPE_10 && account.getStaffid() != null) {
			userDetails.setStaffid(account.getStaffid());
			userDetails.setStaffname(staffsservice.get(account.getStaffid()).getDisplayname());
			Orgstaffjobs osj = orgstaffjobsservice.getByStaffId(account.getStaffid());
			if (osj != null) {
				Orgcampuses oc = orgcampusesservice.getById(osj.getCampusid());
				userDetails.setCampusname(oc.getCampusname());
				userDetails.setBranchname(oc.getBranchidname());
				userDetails.setRegionid(osj.getRegionid());
				userDetails.setBranchid(osj.getBranchid());
				userDetails.setCampusid(osj.getCampusid());
				userDetails.setStaffjobid(osj.getStaffjobid());
				userDetails.setStaffjobname(osj.getStaffjobidname());
			}
		} else if (account.getType().longValue() == DictionaryResource.ACCOUNT_TYPE_11 && account.getStaffid() != null) {
			Teacherjobs tj = teacherjobsservice.getByTeacherId(account.getStaffid());
			if (tj != null) {
				Orgcampuses oc = orgcampusesservice.getById(tj.getCampusid());
				userDetails.setCampusid(tj.getCampusid());
				userDetails.setCampusname(oc.getCampusname());
				userDetails.setBranchname(oc.getBranchidname());
				userDetails.setStaffjobid(tj.getJoborgid());
				userDetails.setStaffname(tj.getTeacheridname());
				userDetails.setStaffjobname(tj.getJobname());
			}
		}
		return userDetails;
	}
}
