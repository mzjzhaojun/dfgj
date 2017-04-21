package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerverifiesController;
import com.yt.app.api.v1.entity.Customerverifies;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:38
*/

public class CustomerverifiesResourceAssembler extends ResourceAssemblerSupport<Customerverifies, CustomerverifiesResource> {
	public CustomerverifiesResourceAssembler() {
		super(CustomerverifiesController.class, CustomerverifiesResource.class);
	}
	@Override	public CustomerverifiesResource toResource(Customerverifies t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerverifiesResource instantiateResource(Customerverifies t) {
		return new CustomerverifiesResource(t);
	}

}