package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerstaffchargesController;
import com.yt.app.api.v1.entity.Customerstaffcharges;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerstaffchargesResourceAssembler extends ResourceAssemblerSupport<Customerstaffcharges, CustomerstaffchargesResource> {
	public CustomerstaffchargesResourceAssembler() {
super(CustomerstaffchargesController.class, CustomerstaffchargesResource.class);
	}
	@Override	public CustomerstaffchargesResource toResource(Customerstaffcharges t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerstaffchargesResource instantiateResource(Customerstaffcharges t) {
return new CustomerstaffchargesResource(t);
	}

}