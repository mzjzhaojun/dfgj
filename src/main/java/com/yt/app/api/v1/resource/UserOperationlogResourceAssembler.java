package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.UserOperationlogController;
import com.yt.app.api.v1.entity.UserOperationlog;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:03
*/

public class UserOperationlogResourceAssembler extends ResourceAssemblerSupport<UserOperationlog, UserOperationlogResource> {
	public UserOperationlogResourceAssembler() {
		super(UserOperationlogController.class, UserOperationlogResource.class);
	}
	@Override	public UserOperationlogResource toResource(UserOperationlog t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected UserOperationlogResource instantiateResource(UserOperationlog t) {
		return new UserOperationlogResource(t);
	}

}