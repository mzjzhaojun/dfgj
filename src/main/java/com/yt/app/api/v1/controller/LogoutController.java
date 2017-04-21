package com.yt.app.api.v1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.app.api.v1.entity.Account;
import com.yt.app.common.base.impl.BaseControllerImpl;

/**
 * @author mazhao
 * 
 * @version v1
 * @createdate 2017-01-05 15:24:14
 */

@RestController
@RequestMapping("/rest/v1/logout")
public class LogoutController extends BaseControllerImpl<Account, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/logout", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getuserid(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<Object>(1, HttpStatus.OK);

	}

}
