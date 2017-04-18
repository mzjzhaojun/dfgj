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
import com.yt.app.common.security.AccountSecurityUser;
import com.yt.app.common.security.RequestAccount;
import com.yt.app.api.v1.resource.MenuResourceAssembler;
import com.yt.app.api.v1.service.MenuService;
import com.yt.app.api.v1.entity.Link;
import com.yt.app.api.v1.entity.Menu;
import com.yt.app.api.v1.entity.Sys;

/**
 * @author zgp default test
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

@RestController
@RequestMapping("/dfgj/v1/menu")
public class MenuController extends BaseControllerImpl<Menu, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MenuService service;

	@Override
	@ApiOperation(value = "列表分页", response = Menu.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		IPage<Menu> pagebean = service.list(param);
		return new ResponseEntity<Object>(new MenuResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> get(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) {
		Menu menu = service.get(id);
		if (menu != null)
			return new ResponseEntity<Object>(menu, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(menu, HttpStatus.NOT_FOUND);

	}

	/**
	 * 新增
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@Override
	@ApiOperation(value = "添加")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> post(RequestEntity<Menu> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Menu menu = requestEntity.getBody();
		Integer i = service.add(menu);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	/**
	 * 修改
	 * 
	 * @param id
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@Override
	@ApiOperation(value = "更新")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> put(@PathVariable Long id, RequestEntity<Menu> requestEntity, HttpServletRequest request,
			HttpServletResponse response) {
		Menu menu = requestEntity.getBody();
		Integer i = service.update(menu);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@Override
	@ApiOperation(value = "删除")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> delete(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) {
		
		Integer i = service.delete(id);
		if (i != null)
			return new ResponseEntity<Object>(i, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(i, HttpStatus.NOT_FOUND);
	}

	/**
	 * 获取链接列表（和菜单下已经选中）
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "列表分页", response = Link.class)
	@RequestMapping(value = "/listLinks", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listLinks(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		List<Link> pagebean = service.listLinks(param);
		return new ResponseEntity<Object>(pagebean, HttpStatus.OK);
	}

	/**
	 * 生成父级树
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "列表分页", response = Menu.class)
	@RequestMapping(value = "/ptree", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> ptree(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		// Map<String, Object> param =
		// RequestUtil.requestEntityToParamMap(requestEntity);
		List<Menu> pagebean = service.getlist();
		return new ResponseEntity<Object>(pagebean, HttpStatus.OK);
	}

	/**
	 * 系统菜单
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "列表分页", response = Sys.class)
	@RequestMapping(value = "/sysmenu", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> sysmenu(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		// List<Sys> pagebean = service.sysmenu(param);
		/**
		 * 返回形式根据web端需求修改
		 */
		AccountSecurityUser acu = RequestAccount.requestGetAccount(request);
		param.put("userid", acu.getAccount().getId());
		Map<String, Object> pagebean = service.sysmenu(param);
		return new ResponseEntity<Object>(pagebean, HttpStatus.OK);
	}

	/**
	 * （便捷修改菜单排序）
	 * 
	 * @param id
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "修改sortno", response = Menu.class)
	@RequestMapping(value = "/sortno", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> putsortno(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		Integer i = service.updatesortno(param);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}
}
