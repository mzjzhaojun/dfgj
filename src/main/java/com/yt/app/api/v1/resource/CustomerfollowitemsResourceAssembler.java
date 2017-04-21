package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerfollowitemsController;
import com.yt.app.api.v1.entity.Customerfollowitems;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:30
*/

public class CustomerfollowitemsResourceAssembler extends ResourceAssemblerSupport<Customerfollowitems, CustomerfollowitemsResource> {
	public CustomerfollowitemsResourceAssembler() {
		super(CustomerfollowitemsController.class, CustomerfollowitemsResource.class);
	}
	@Override	public CustomerfollowitemsResource toResource(Customerfollowitems t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerfollowitemsResource instantiateResource(Customerfollowitems t) {
		return new CustomerfollowitemsResource(t);
	}

}