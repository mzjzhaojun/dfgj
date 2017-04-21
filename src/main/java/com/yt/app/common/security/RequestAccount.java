package com.yt.app.common.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextImpl;

import com.yt.app.common.resource.CommonResource;


public class RequestAccount {
	
	public static AccountSecurityUser requestGetAccount(HttpServletRequest request) {
		SecurityContextImpl sc = (SecurityContextImpl) request.getSession().getAttribute(CommonResource.SPRING_SECURITY_CONTEXT);
		if (sc != null) {
			AccountSecurityUser acu = (AccountSecurityUser) sc.getAuthentication().getPrincipal();
			return acu;
		}
		return null;
	}

	public static void requestRemoveAccount(HttpServletRequest request) {
		request.getSession().removeAttribute(CommonResource.SPRING_SECURITY_CONTEXT);
	}
}
