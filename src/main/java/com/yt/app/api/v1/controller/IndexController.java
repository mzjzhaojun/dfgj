package com.yt.app.api.v1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.app.common.resource.CommonResource;

import io.swagger.annotations.ApiOperation;

/**
 * @author zj
 * 
 * @version v1
 * @createdate 2016-10-27 17:32:56
 */

@RestController
@RequestMapping("/rest/v1/index")
public class IndexController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@ApiOperation(value = "跳转登录")
	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<Object>(CommonResource.SPRING_LOGIN_INDEX, HttpStatus.OK);
	}

}
