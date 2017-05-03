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
import com.yt.app.api.v1.resource.AccountResourceAssembler;
import com.yt.app.api.v1.service.AccountService;
import com.yt.app.api.v1.entity.Account;
import com.yt.app.api.v1.entity.Dictionary;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-27 17:32:56
 */

@RestController
@RequestMapping("/rest/v1/account")
public class AccountController extends BaseControllerImpl<Account, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private AccountService service;

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> user(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		AccountSecurityUser acu = RequestAccount.requestGetAccount(request);
		if (acu == null)
			return new ResponseEntity<Object>(HttpStatus.UNAUTHORIZED);
		return new ResponseEntity<Object>(acu, HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "列表分页", response = Account.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		IPage<Account> pagebean = service.getlist(param);
		return new ResponseEntity<Object>(new AccountResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "添加")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> post(RequestEntity<Account> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.addobject(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "删除")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> delete(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.deletebyid(id);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "更新")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> put(@PathVariable Long id, RequestEntity<Account> requestEntity, HttpServletRequest request,
			HttpServletResponse response) {
		Integer i = service.updatebyid(requestEntity.getBody());
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}

	@Override
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> get(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
		Account t = service.getById(id);
		if (t != null)
			return new ResponseEntity<Object>(t, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(t, HttpStatus.NOT_FOUND);
	}

	@ApiOperation(value = "账号类型列表")
	@RequestMapping(value = "/accounttype", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listaccount(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		List<Dictionary> pagebean = service.getlistaccount();
		return new ResponseEntity<Object>(pagebean, HttpStatus.OK);
	}

}
