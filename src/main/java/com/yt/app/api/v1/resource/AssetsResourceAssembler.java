package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AssetsController;
import com.yt.app.api.v1.entity.Assets;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:18
*/

public class AssetsResourceAssembler extends ResourceAssemblerSupport<Assets, AssetsResource> {
	public AssetsResourceAssembler() {
		super(AssetsController.class, AssetsResource.class);
	}
	@Override	public AssetsResource toResource(Assets t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AssetsResource instantiateResource(Assets t) {
		return new AssetsResource(t);
	}

}