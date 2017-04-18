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

import com.yt.app.frame.page.IPage;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.RegionResourceAssembler;
import com.yt.app.api.v1.service.RegionService;
import com.yt.app.api.v1.entity.Region;

/**
* @author huanghao
* 
* @version v1
* @createdate  2016-11-04 15:40:04
*/


@RestController
@RequestMapping("/dfgj/v1/region")
public class RegionController extends BaseControllerImpl<Region, Long> {


protected Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
  private RegionService service;



	@Override
	@ApiOperation(value = "列表分页", response = Region.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
	    IPage<Region> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new RegionResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}
	
	/**
	 * 查询等级
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "列表分页", response = Region.class)
	@RequestMapping(value = "/grade", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> ptree(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		
		List<Region> pagebean = service.getlist();
		return new ResponseEntity<Object>(pagebean, HttpStatus.OK);
	}

	/**
	 * 省市县查询
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "省市县查询", response = Region.class)
	@RequestMapping(value = "/listAll", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listAll(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		
		List<Region> pagebean = service.getlistAll();
		return new ResponseEntity<Object>(pagebean, HttpStatus.OK);
	}

	/**
	 * 查询(根据parentid)
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "根据parentid查询", response = Region.class)
	@RequestMapping(value = "/getbyparentid/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getbyparentid(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
			
		List<Region> t = service.getbyparentid(id);
		if (t != null)
			return new ResponseEntity<Object>(t, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(t, HttpStatus.NOT_FOUND);
	}
	
	/**
	 * 省市县查询
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@ApiOperation(value = "省市县查询分类", response = Region.class)
	@RequestMapping(value = "/listallstyle", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listAllstyle(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		
		List<Region> pagebean = service.getlistAllStyle();
		return new ResponseEntity<Object>(pagebean, HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "添加")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> post(RequestEntity<Region> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.addobject(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	
}










