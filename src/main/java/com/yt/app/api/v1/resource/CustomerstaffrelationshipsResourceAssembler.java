package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerstaffrelationshipsController;
import com.yt.app.api.v1.entity.Customerstaffrelationships;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerstaffrelationshipsResourceAssembler extends ResourceAssemblerSupport<Customerstaffrelationships, CustomerstaffrelationshipsResource> {
	public CustomerstaffrelationshipsResourceAssembler() {
super(CustomerstaffrelationshipsController.class, CustomerstaffrelationshipsResource.class);
	}
	@Override	public CustomerstaffrelationshipsResource toResource(Customerstaffrelationships t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerstaffrelationshipsResource instantiateResource(Customerstaffrelationships t) {
return new CustomerstaffrelationshipsResource(t);
	}

}