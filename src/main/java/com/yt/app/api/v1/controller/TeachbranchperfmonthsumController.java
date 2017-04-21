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
import com.yt.app.frame.page.IPage;
import io.swagger.annotations.ApiOperation;
import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.api.v1.resource.TeachbranchperfmonthsumResourceAssembler;
import com.yt.app.api.v1.service.TeachbranchperfmonthsumService;
import com.yt.app.api.v1.entity.Teachbranchperfmonthsum;

/**
* @author zj    default  test
* 
* @version v1
* @createdate  2017-04-20 13:48:58
*/


@RestController
@RequestMapping("/rest/v1/teachbranchperfmonthsum")
public class TeachbranchperfmonthsumController extends BaseControllerImpl<Teachbranchperfmonthsum, Long> {


protected Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
  private TeachbranchperfmonthsumService service;



	@Override
	@ApiOperation(value = "列表分页", response = Teachbranchperfmonthsum.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
	    IPage<Teachbranchperfmonthsum> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new TeachbranchperfmonthsumResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}
}










