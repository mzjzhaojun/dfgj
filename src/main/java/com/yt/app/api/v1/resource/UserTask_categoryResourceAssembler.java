package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.UserTask_categoryController;
import com.yt.app.api.v1.entity.UserTask_category;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class UserTask_categoryResourceAssembler extends ResourceAssemblerSupport<UserTask_category, UserTask_categoryResource> {
	public UserTask_categoryResourceAssembler() {
		super(UserTask_categoryController.class, UserTask_categoryResource.class);
	}
	@Override	public UserTask_categoryResource toResource(UserTask_category t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected UserTask_categoryResource instantiateResource(UserTask_category t) {
		return new UserTask_categoryResource(t);
	}

}