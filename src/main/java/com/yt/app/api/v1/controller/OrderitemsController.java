package com.yt.app.api.v1.controller;

import java.util.List;

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

import com.yt.app.frame.m.IPage;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.OrderitemsResourceAssembler;
import com.yt.app.api.v1.service.OrderitemsService;
import com.yt.app.api.v1.entity.Orderitems;

/**
 * @author zj default test
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@RestController
@RequestMapping("/rest/v1/orderitems")
public class OrderitemsController extends BaseControllerImpl<Orderitems, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private OrderitemsService service;

	@ApiOperation(value = "添加")
	@RequestMapping(value = "/savas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> savalist(RequestEntity<List<Orderitems>> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.sava(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "列表分页", response = Orderitems.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Orderitems> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new OrderitemsResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}
}
