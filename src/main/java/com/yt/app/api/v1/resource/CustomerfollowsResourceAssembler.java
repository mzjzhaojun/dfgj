package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerfollowsController;
import com.yt.app.api.v1.entity.Customerfollows;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:31
*/

public class CustomerfollowsResourceAssembler extends ResourceAssemblerSupport<Customerfollows, CustomerfollowsResource> {
	public CustomerfollowsResourceAssembler() {
		super(CustomerfollowsController.class, CustomerfollowsResource.class);
	}
	@Override	public CustomerfollowsResource toResource(Customerfollows t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerfollowsResource instantiateResource(Customerfollows t) {
		return new CustomerfollowsResource(t);
	}

}