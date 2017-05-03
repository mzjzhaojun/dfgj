package com.yt.app.common.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;

/**
 * 封装登陆用户
 * 
 * @author zj
 *
 */
@Getter
@Setter
public class AccountSecurityUser extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Long accountid;
	Long staffid;
	String staffname;
	Long regionid;
	Long campusid;
	Long branchid;
	Long staffjobid;

	public AccountSecurityUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

}
