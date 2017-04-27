package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerexpenserelationsController;
import com.yt.app.api.v1.entity.Customerexpenserelations;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomerexpenserelationsResourceAssembler extends ResourceAssemblerSupport<Customerexpenserelations, CustomerexpenserelationsResource> {
	public CustomerexpenserelationsResourceAssembler() {
		super(CustomerexpenserelationsController.class, CustomerexpenserelationsResource.class);
	}

	@Override
	public CustomerexpenserelationsResource toResource(Customerexpenserelations t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerexpenserelationsResource instantiateResource(Customerexpenserelations t) {
		return new CustomerexpenserelationsResource(t);
	}

}