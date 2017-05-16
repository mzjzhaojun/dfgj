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
import com.yt.app.api.v1.resource.ExpensesResourceAssembler;
import com.yt.app.api.v1.service.ExpensesService;
import com.yt.app.api.v1.entity.Expenses;

/**
 * @author zj default test
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

@RestController
@RequestMapping("/rest/v1/expenses")
public class ExpensesController extends BaseControllerImpl<Expenses, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ExpensesService service;

	@Override
	@ApiOperation(value = "列表分页", response = Expenses.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<Expenses> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new ExpensesResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}
}
