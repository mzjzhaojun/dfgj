package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.UserOperation_logController;
import com.yt.app.api.v1.entity.UserOperation_log;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class UserOperation_logResourceAssembler extends ResourceAssemblerSupport<UserOperation_log, UserOperation_logResource> {
	public UserOperation_logResourceAssembler() {
		super(UserOperation_logController.class, UserOperation_logResource.class);
	}
	@Override	public UserOperation_logResource toResource(UserOperation_log t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected UserOperation_logResource instantiateResource(UserOperation_log t) {
		return new UserOperation_logResource(t);
	}

}