package com.yt.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.yt.app.common.security.AccountAuthenticationProvider;
import com.yt.app.frame.security.RESTAuthenticationEntryPoint;
import com.yt.app.frame.security.RESTAuthenticationFailureHandler;
import com.yt.app.frame.security.RESTAuthenticationSuccessHandler;

/**
 * The SecurityConfiguration class provides a centralized location for
 * application security configuration. This class bootstraps the Spring Security
 * components during application startup.
 * 
 * @author ZJ
 */
@Configuration
@EnableWebSecurity
@Order(-20)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private AccountAuthenticationProvider accountAuthenticationProvider;

	@Autowired
	private RESTAuthenticationEntryPoint authenticationEntryPoint;

	@Autowired
	private RESTAuthenticationFailureHandler authenticationFailureHandler;

	@Autowired
	private RESTAuthenticationSuccessHandler authenticationSuccessHandler;

	/**
	 * Supplies a PasswordEncoder instance to the Spring ApplicationContext. The
	 * PasswordEncoder is used by the AuthenticationProvider to perform one-way
	 * hash operations on passwords for credential comparison.
	 * 
	 * @return A PasswordEncoder.
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * This method builds the AuthenticationProvider used by the system to
	 * process authentication requests.
	 * 
	 * @param auth
	 *            An AuthenticationManagerBuilder instance used to construct the
	 *            AuthenticationProvider.
	 * @throws Exception
	 *             Thrown if a problem occurs constructing the
	 *             AuthenticationProvider.
	 */
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(accountAuthenticationProvider);
	}

	/**
	 * This inner class configures the WebSecurityConfigurerAdapter instance for
	 * the web service API context paths.
	 * 
	 * @author ZJ
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// 跨域攻击
		http.csrf().disable();
		// 禁用自动修改headers
		http.headers().frameOptions().disable();
		// api
//		http.authorizeRequests().antMatchers("/**").permitAll();
		
		http.authorizeRequests().antMatchers("/webjars/**").permitAll();
		http.authorizeRequests().antMatchers("/swagger-resources/**").permitAll();
		http.authorizeRequests().antMatchers("/v2/**").permitAll();
		http.authorizeRequests().antMatchers("/error/**").permitAll();
		http.authorizeRequests().antMatchers("/configuration/**").permitAll();
		http.authorizeRequests().antMatchers("/app/v1/**").permitAll();
		http.authorizeRequests().antMatchers("/rest/v1/file/**").permitAll();
		http.authorizeRequests().antMatchers("/rest/v1/filevoice/**").permitAll();
		http.authorizeRequests().anyRequest().authenticated().
		and().
		exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).
		and().
		formLogin().
		successHandler(authenticationSuccessHandler).
		and().
		formLogin().failureHandler(authenticationFailureHandler).and().logout().logoutSuccessUrl("/rest/v1/logout/logout");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/swagger-ui.html", "/static/**");
	}
}
