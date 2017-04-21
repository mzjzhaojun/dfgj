package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerbasestatController;
import com.yt.app.api.v1.entity.Customerbasestat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:29
*/

public class CustomerbasestatResourceAssembler extends ResourceAssemblerSupport<Customerbasestat, CustomerbasestatResource> {
	public CustomerbasestatResourceAssembler() {
		super(CustomerbasestatController.class, CustomerbasestatResource.class);
	}
	@Override	public CustomerbasestatResource toResource(Customerbasestat t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerbasestatResource instantiateResource(Customerbasestat t) {
		return new CustomerbasestatResource(t);
	}

}