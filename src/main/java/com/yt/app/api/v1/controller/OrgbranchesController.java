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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.app.frame.m.IPage;
import com.yt.app.frame.p.RequestUtil;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.OrgbranchesResourceAssembler;
import com.yt.app.api.v1.service.OrgbranchesService;
import com.yt.app.api.v1.entity.Orgbranches;

/**
 * @author zj default test
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:49
 */

@RestController
@RequestMapping("/rest/v1/orgbranches")
public class OrgbranchesController extends BaseControllerImpl<Orgbranches, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private OrgbranchesService service;

	@Override
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> get(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
		Orgbranches t = service.getById(id);
		if (t != null)
			return new ResponseEntity<Object>(t, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(t, HttpStatus.NOT_FOUND);
	}

	@Override
	@ApiOperation(value = "列表分页", response = Orgbranches.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Orgbranches> pagebean = service.listpage(RequestUtil.requestEntityToParamMap(requestEntity));
		return new ResponseEntity<Object>(new OrgbranchesResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(),
				HttpStatus.OK);
	}
}
