package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomermeetingsController;
import com.yt.app.api.v1.entity.Customermeetings;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomermeetingsResourceAssembler extends ResourceAssemblerSupport<Customermeetings, CustomermeetingsResource> {
	public CustomermeetingsResourceAssembler() {
		super(CustomermeetingsController.class, CustomermeetingsResource.class);
	}
	@Override	public CustomermeetingsResource toResource(Customermeetings t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomermeetingsResource instantiateResource(Customermeetings t) {
		return new CustomermeetingsResource(t);
	}

}