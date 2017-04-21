package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerrelationsController;
import com.yt.app.api.v1.entity.Customerrelations;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:32
*/

public class CustomerrelationsResourceAssembler extends ResourceAssemblerSupport<Customerrelations, CustomerrelationsResource> {
	public CustomerrelationsResourceAssembler() {
		super(CustomerrelationsController.class, CustomerrelationsResource.class);
	}
	@Override	public CustomerrelationsResource toResource(Customerrelations t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerrelationsResource instantiateResource(Customerrelations t) {
		return new CustomerrelationsResource(t);
	}

}