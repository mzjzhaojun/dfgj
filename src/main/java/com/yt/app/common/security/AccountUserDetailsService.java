package com.yt.app.common.security;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.entity.Account;
import com.yt.app.api.v1.service.AccountService;

/**
 * A Spring Security UserDetailsService implementation which creates UserDetails
 * objects from the Account and Role entities.
 * 
 * @author ZJ
 */
@Service
public class AccountUserDetailsService implements UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * The AccountService business service.
	 */
	@Autowired
	private AccountService accountService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.debug("> loadUserByUsername {}", username);
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
		userDetails.setAccount(account);
		logger.debug("< loadUserByUsername {}", username);
		return userDetails;
	}

}
