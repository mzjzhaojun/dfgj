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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.app.frame.page.IPage;

import io.swagger.annotations.ApiOperation;

import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.LinkResourceAssembler;
import com.yt.app.api.v1.service.LinkService;
import com.yt.app.api.v1.entity.Link;

/**
* @author ssh
* 
* @version v1
* @createdate  2016-10-14 10:17:35
*/


@RestController
@RequestMapping("/rest/v1/link")
public class LinkController extends BaseControllerImpl<Link, Long> {


protected Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
  private LinkService service;



	@Override
	@ApiOperation(value = "列表分页", response = Link.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request,
			HttpServletResponse response) {
	    IPage<Link> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new LinkResourceAssembler().toResources(pagebean.getPageList()),
				pagebean.getHeaders(), HttpStatus.OK);
	}
	
	/**
	 * 链接新增
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@Override
	@ApiOperation(value = "添加")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> post(RequestEntity<Link> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.add(requestEntity);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}
	
	/**
	 * 链接修改
	 * 
	 * @param requestEntity
	 * @param request
	 * @param response
	 * @return
	 */
	@Override
	@ApiOperation(value = "更新")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> put(@PathVariable Long id, RequestEntity<Link> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		Integer i = service.update(requestEntity);
		return new ResponseEntity<Object>(i, HttpStatus.OK);
	}
	/**
	 * 链接删除
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
	 * 链接查询
	 */
	@Override
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> get(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
		Link link = service.get(id);
		if (link != null)
			return new ResponseEntity<Object>(link, HttpStatus.OK);
		else
			return new ResponseEntity<Object>(link, HttpStatus.NOT_FOUND);
	}
}










