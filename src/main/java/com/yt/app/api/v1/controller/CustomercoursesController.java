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
import com.yt.app.api.v1.resource.CustomercoursesResourceAssembler;
import com.yt.app.api.v1.service.CustomercoursesService;
import com.yt.app.api.v1.entity.Customercourses;

/**
 * @author zj default test
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

@RestController
@RequestMapping("/rest/v1/customercourses")
public class CustomercoursesController extends BaseControllerImpl<Customercourses, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CustomercoursesService service;

	@Override
	@ApiOperation(value = "列表分页", response = Customercourses.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Customercourses> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new CustomercoursesResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(),
				HttpStatus.OK);
	}
}
