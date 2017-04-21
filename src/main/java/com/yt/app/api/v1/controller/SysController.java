package com.yt.app.api.v1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

import com.yt.app.frame.page.IPage;
import com.yt.app.modul.Tree;
import com.yt.app.util.RequestUtil;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.SysResourceAssembler;
import com.yt.app.api.v1.service.SysService;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Sys;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

@RestController
@RequestMapping("/rest/v1/sys")
public class SysController extends BaseControllerImpl<Sys, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SysService service;

	@Override
	@ApiOperation(value = "列表分页", response = Sys.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		IPage<Sys> pagebean = service.getlist(param);
		return new ResponseEntity<Object>(new SysResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> get(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> sys = service.getid(id);
		if (sys != null)
			return new ResponseEntity<Object>(sys, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(sys, HttpStatus.NOT_FOUND);
	}

	@Override
	@ApiOperation(value = "添加")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> post(RequestEntity<Sys> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.addSys(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	@ApiOperation(value = "列表分页", response = Tree.class)
	@RequestMapping(value = "/listSys", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listSys(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		List<Sys> list = service.listSys();
		List<Tree> treeList = new ArrayList<Tree>();
		for (Sys s : list) {
			Tree t = new Tree(s.getId() + "", s.getParent_id() == null ? "0" : s.getParent_id() + "", s.getName(), true, s.getLinkUrl());
			treeList.add(t);
		}
		return new ResponseEntity<Object>(treeList, HttpStatus.OK);
	}

	@ApiOperation(value = "列表分页", response = Sys.class)
	@RequestMapping(value = "/listSyslevel", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listSyslevel(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		List<Sys> list = service.listSyslevel();
		return new ResponseEntity<Object>(list, HttpStatus.OK);
	}

	@ApiOperation(value = "系统等级", response = Sys.class)
	@RequestMapping(value = "/syslevel", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> syslevel(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		List<Dictionary> list = service.syslevel();
		return new ResponseEntity<Object>(list, HttpStatus.OK);
	}
}
