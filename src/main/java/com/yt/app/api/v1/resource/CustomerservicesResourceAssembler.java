package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerservicesController;
import com.yt.app.api.v1.entity.Customerservices;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:34
*/

public class CustomerservicesResourceAssembler extends ResourceAssemblerSupport<Customerservices, CustomerservicesResource> {
	public CustomerservicesResourceAssembler() {
		super(CustomerservicesController.class, CustomerservicesResource.class);
	}
	@Override	public CustomerservicesResource toResource(Customerservices t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerservicesResource instantiateResource(Customerservices t) {
		return new CustomerservicesResource(t);
	}

}