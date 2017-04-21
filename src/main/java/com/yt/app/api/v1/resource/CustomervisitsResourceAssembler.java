package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomervisitsController;
import com.yt.app.api.v1.entity.Customervisits;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:38
*/

public class CustomervisitsResourceAssembler extends ResourceAssemblerSupport<Customervisits, CustomervisitsResource> {
	public CustomervisitsResourceAssembler() {
		super(CustomervisitsController.class, CustomervisitsResource.class);
	}
	@Override	public CustomervisitsResource toResource(Customervisits t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomervisitsResource instantiateResource(Customervisits t) {
		return new CustomervisitsResource(t);
	}

}