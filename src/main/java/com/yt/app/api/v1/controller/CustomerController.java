package com.yt.app.api.v1.controller;

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
import com.yt.app.api.v1.resource.CustomerResourceAssembler;
import com.yt.app.api.v1.service.CustomerService;
import com.yt.app.api.v1.entity.Customer;

/**
 * @author zj default test
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

@RestController
@RequestMapping("/rest/v1/customer")
public class CustomerController extends BaseControllerImpl<Customer, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CustomerService service;

	@ApiOperation(value = "添加")
	@RequestMapping(value = "/sava", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> sava(RequestEntity<Customer> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Customer t = service.sava(requestEntity.getBody());
		return new ResponseEntity<Object>(t, HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "列表分页", response = Customer.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Customer> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new CustomerResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}
}
