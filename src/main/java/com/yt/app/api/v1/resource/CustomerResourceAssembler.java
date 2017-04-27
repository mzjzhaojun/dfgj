package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerController;
import com.yt.app.api.v1.entity.Customer;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CustomerResourceAssembler extends ResourceAssemblerSupport<Customer, CustomerResource> {
	public CustomerResourceAssembler() {
		super(CustomerController.class, CustomerResource.class);
	}

	@Override
	public CustomerResource toResource(Customer t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerResource instantiateResource(Customer t) {
		return new CustomerResource(t);
	}

}