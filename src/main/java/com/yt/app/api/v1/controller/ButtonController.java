package com.yt.app.api.v1.controller;

import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.app.api.v1.entity.Button;
import com.yt.app.api.v1.resource.ButtonResourceAssembler;
import com.yt.app.api.v1.service.ButtonService;
import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.frame.m.IPage;

/**
 * @author zj default test
 * 
 * @version 1.1
 */

@RestController
@RequestMapping("/rest/v1/button")
public class ButtonController extends BaseControllerImpl<Button, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ButtonService service;

	@Override
	@ApiOperation(value = "列表", response = Button.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Button> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new ButtonResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}
}
