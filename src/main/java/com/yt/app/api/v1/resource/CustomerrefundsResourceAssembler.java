package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerrefundsController;
import com.yt.app.api.v1.entity.Customerrefunds;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerrefundsResourceAssembler extends ResourceAssemblerSupport<Customerrefunds, CustomerrefundsResource> {
	public CustomerrefundsResourceAssembler() {
		super(CustomerrefundsController.class, CustomerrefundsResource.class);
	}

	@Override
	public CustomerrefundsResource toResource(Customerrefunds t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerrefundsResource instantiateResource(Customerrefunds t) {
		return new CustomerrefundsResource(t);
	}

}