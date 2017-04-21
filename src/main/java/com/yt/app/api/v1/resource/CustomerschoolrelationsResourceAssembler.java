package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerschoolrelationsController;
import com.yt.app.api.v1.entity.Customerschoolrelations;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:33
*/

public class CustomerschoolrelationsResourceAssembler extends ResourceAssemblerSupport<Customerschoolrelations, CustomerschoolrelationsResource> {
	public CustomerschoolrelationsResourceAssembler() {
		super(CustomerschoolrelationsController.class, CustomerschoolrelationsResource.class);
	}
	@Override	public CustomerschoolrelationsResource toResource(Customerschoolrelations t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerschoolrelationsResource instantiateResource(Customerschoolrelations t) {
		return new CustomerschoolrelationsResource(t);
	}

}