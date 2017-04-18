package com.yt.app.api.v1.controller;

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
import com.yt.app.util.RequestUtil;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.RoleResourceAssembler;
import com.yt.app.api.v1.service.RoleService;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Role;

/**
* @author huanghao
* 
* @version v1
* @createdate  2016-10-14 10:16:02
*/


@RestController
@RequestMapping("/dfgj/v1/role")
public class RoleController extends BaseControllerImpl<Role, Long> {


protected Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
  private RoleService service;



	@Override
	@ApiOperation(value = "列表分页", response = Role.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
	    IPage<Role> pagebean = service.getlistAll(param);
		return new ResponseEntity<Object>(new RoleResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}



	@Override
	@ApiOperation(value = "添加", response = Role.class)
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> post(RequestEntity<Role> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		
	     Role role =	requestEntity.getBody();
		 Integer i = service.addobject(role);		
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}



	@Override
	@ApiOperation(value = "更新")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> put(Long id, RequestEntity<Role> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		
		  Role role =	requestEntity.getBody();
		  Integer i = service.updateobject(role);	
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}



	@Override
	@ApiOperation(value = "删除")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> delete(@PathVariable(value = "id")Long id, HttpServletRequest request, HttpServletResponse response) {
		
		Integer i = service.deletebyid(id);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}



	@Override
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> get(@PathVariable(value = "id")Long id, HttpServletRequest request, HttpServletResponse response) {
		
		Map<String, Object>  map =	service.getid(id);
	
			return new ResponseEntity<Object>(map, HttpStatus.OK);
	
	}

	@ApiOperation(value = "查询类型")
	@RequestMapping(value = "/dicttype", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getdicttype(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		
		List<Dictionary>  map =	service.getdicttype();	
		return new ResponseEntity<Object>(map, HttpStatus.OK);
	
	}

	
}










