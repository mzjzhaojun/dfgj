package com.yt.app.common.base.impl;

import java.io.Serializable;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yt.app.common.base.IBaseController;
import com.yt.app.common.base.IBaseService;
import com.yt.app.frame.page.IPage;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * baseController
 * 
 * @author zj
 * 
 */
@RestController
public abstract class BaseControllerImpl<T, ID extends Serializable> implements IBaseController<T, ID> {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IBaseService<T, Long> service;

	/**
	 * 
	 * 
	 * @version 1.1
	 */
	@Override
	@ApiOperation(value = "添加")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> post(RequestEntity<T> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.post(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	/**
	 * 
	 * 
	 * @version 1.1
	 */
	@Override
	@ApiOperation(value = "更新")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> put(@PathVariable Long id, RequestEntity<T> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.put(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	/**
	 * 
	 * 
	 * @version 1.1
	 */
	@Override
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> get(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
		T t = service.get(id);
		if (t != null)
			return new ResponseEntity<Object>(t, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(t, HttpStatus.NOT_FOUND);
	}

	/**
	 * 
	 * 
	 * @version 1.1
	 */
	@Override
	@ApiOperation(value = "删除")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> delete(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.delete(id);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	/**
	 * 
	 * 
	 * @version 1.1
	 */
	@Override
	@ApiOperation(value = "列表分页")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<?> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(pagebean.getPageList(), pagebean.getHeaders(), HttpStatus.OK);
	}

}
