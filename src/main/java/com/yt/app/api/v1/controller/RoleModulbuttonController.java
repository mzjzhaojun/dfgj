package com.yt.app.api.v1.controller;

import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.app.api.v1.entity.Menu;
import com.yt.app.api.v1.entity.RoleModulbutton;
import com.yt.app.api.v1.resource.MenuResourceAssembler;
import com.yt.app.api.v1.resource.RoleModulbuttonResourceAssembler;
import com.yt.app.api.v1.service.RoleModulbuttonService;
import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.frame.m.IPage;

/**
 * @author zj default test
 * 
 * @version 1.1
 */

@RestController
@RequestMapping("/rest/v1/rolemodulbutton")
public class RoleModulbuttonController extends BaseControllerImpl<RoleModulbutton, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RoleModulbuttonService service;

	@Override
	@ApiOperation(value = "列表", response = RoleModulbutton.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<RoleModulbutton> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new RoleModulbuttonResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(),
				HttpStatus.OK);
	}

	@ApiOperation(value = "获取角色下的功能列表", response = RoleModulbutton.class)
	@RequestMapping(value = "/getModulsByRoleId/{roleid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getModulsByRoleId(@PathVariable String roleid) {
		List<Menu> listModul = service.getModulsByRoleId(roleid);
		return new ResponseEntity<Object>(new MenuResourceAssembler().toResources(listModul), HttpStatus.OK);
	}

	@ApiOperation(value = "添加修改多个关联关系")
	@RequestMapping(value = "/adds/{roleid}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> adds(@PathVariable String roleid, @RequestBody RoleModulbutton[] rmbs) {
		Integer i = service.adds(roleid, rmbs);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

}
