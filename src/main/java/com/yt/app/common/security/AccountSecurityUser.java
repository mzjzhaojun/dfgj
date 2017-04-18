package com.yt.app.common.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.yt.app.api.v1.entity.Account;

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

	Account account;

	// Role role;

	public AccountSecurityUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

}
