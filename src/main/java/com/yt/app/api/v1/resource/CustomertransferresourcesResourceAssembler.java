package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomertransferresourcesController;
import com.yt.app.api.v1.entity.Customertransferresources;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomertransferresourcesResourceAssembler extends ResourceAssemblerSupport<Customertransferresources, CustomertransferresourcesResource> {
	public CustomertransferresourcesResourceAssembler() {
		super(CustomertransferresourcesController.class, CustomertransferresourcesResource.class);
	}
	@Override	public CustomertransferresourcesResource toResource(Customertransferresources t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomertransferresourcesResource instantiateResource(Customertransferresources t) {
		return new CustomertransferresourcesResource(t);
	}

}