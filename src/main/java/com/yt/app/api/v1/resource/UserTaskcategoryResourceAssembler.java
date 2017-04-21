package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.UserTaskcategoryController;
import com.yt.app.api.v1.entity.UserTaskcategory;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:04
*/

public class UserTaskcategoryResourceAssembler extends ResourceAssemblerSupport<UserTaskcategory, UserTaskcategoryResource> {
	public UserTaskcategoryResourceAssembler() {
		super(UserTaskcategoryController.class, UserTaskcategoryResource.class);
	}
	@Override	public UserTaskcategoryResource toResource(UserTaskcategory t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected UserTaskcategoryResource instantiateResource(UserTaskcategory t) {
		return new UserTaskcategoryResource(t);
	}

}