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

import com.yt.app.frame.page.IPage;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.DictionaryResourceAssembler;
import com.yt.app.api.v1.service.DictionaryService;
import com.yt.app.api.v1.entity.Dictionary;

/**
 * @author zj default test
 * 
 * @version v1
 * @createdate 2017-04-19 17:03:14
 */

@RestController
@RequestMapping("/rest/v1/dictionary")
public class DictionaryController extends BaseControllerImpl<Dictionary, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private DictionaryService service;

	@Override
	@ApiOperation(value = "列表分页", response = Dictionary.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Dictionary> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new DictionaryResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}

	@ApiOperation(value = "列表分页", response = Dictionary.class)
	@RequestMapping(value = "/typecodes", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listtypecodes(RequestEntity<long[]> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		List<Dictionary> list = service.listtypecodes(requestEntity.getBody());
		return new ResponseEntity<Object>(list, HttpStatus.OK);
	}
}
