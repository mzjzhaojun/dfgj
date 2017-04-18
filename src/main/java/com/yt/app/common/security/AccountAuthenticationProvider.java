package com.yt.app.common.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.yt.app.frame.config.AppConfig;
import com.yt.app.frame.config.PasswordEncoders;
import com.yt.app.frame.security.AccountAbstractUserDetailsAuthenticationProvider;

/**
 * A Spring Security AuthenticationProvider which extends
 * <code>AbstractUserDetailsAuthenticationProvider</code>. This classes uses the
 * <code>AccountUserDetailsService</code> to retrieve a UserDetails instance.
 * 
 * A PasswordEncoder compares the supplied authentication credentials to those
 * in the UserDetails.
 * 
 * @author ZJ
 */
@Component
public class AccountAuthenticationProvider extends AccountAbstractUserDetailsAuthenticationProvider {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * A Spring Security UserDetailsService implementation based upon the
	 * Account entity model.
	 */
	@Autowired
	private AccountUserDetailsService userDetailsService;

	/**
	 * A PasswordEncoder instance to hash clear test password values.
	 */
	@Autowired
	private PasswordEncoders passwordEncoder;

	@Autowired
	AppConfig appConfig;

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken token) throws AuthenticationException {
		logger.debug("> additionalAuthenticationChecks");

		if (token.getCredentials() == null || userDetails.getPassword() == null) {
			logger.debug("< additionalAuthenticationChecks");
			throw new BadCredentialsException("账号未设置密码!");
		}
		if (!passwordEncoder.matches((String) token.getCredentials(), userDetails.getPassword())) {
			logger.debug("< additionalAuthenticationChecks");
			throw new BadCredentialsException("账号密码错误!");
		}
		// if
		// (!MD5.MD5Encode(token.getCredentials().toString()).equals(userDetails.getPassword()))
		// {
		// logger.debug("< additionalAuthenticationChecks");
		// throw new BadCredentialsException("账号密码错误!");
		// }
		// if (!appConfig.getWorkerKey().equals(MacAddressUtil.getMacAddress()))
		// {
		// logger.debug("< additionalAuthenticationChecks");
		// throw new BadCredentialsException("系统被锁定！请联系qq2115825。");
		// }
		logger.debug("< additionalAuthenticationChecks");
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken token) throws AuthenticationException {
		logger.debug("> retrieveUser");
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		logger.debug("< retrieveUser");
		return userDetails;
	}

}
