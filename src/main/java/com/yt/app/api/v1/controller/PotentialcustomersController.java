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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.app.frame.m.IPage;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.PotentialcustomersResourceAssembler;
import com.yt.app.api.v1.service.PotentialcustomersService;
import com.yt.app.api.v1.entity.Potentialcustomers;

/**
 * @author zj default test
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

@RestController
@RequestMapping("/rest/v1/potentialcustomers")
public class PotentialcustomersController extends BaseControllerImpl<Potentialcustomers, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private PotentialcustomersService service;

	@Override
	@ApiOperation(value = "列表分页", response = Potentialcustomers.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Potentialcustomers> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new PotentialcustomersResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(),
				HttpStatus.OK);
	}

	@ApiOperation(value = "批量更新责任人", response = Potentialcustomers.class)
	@RequestMapping(value = "/batch/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updatebatch(@PathVariable Long id, RequestEntity<List<Long>> requestEntity, HttpServletRequest request,
			HttpServletResponse response) {
		Integer i = service.updatebatch(requestEntity.getBody(), id);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	@ApiOperation(value = "批量转为正式学员", response = Potentialcustomers.class)
	@RequestMapping(value = "/batch", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updatecustomerbatch(RequestEntity<List<Long>> requestEntity, HttpServletRequest request,
			HttpServletResponse response) {
		Integer i = service.updatecustomerbatch(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}
}
