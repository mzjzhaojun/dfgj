package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerservicesController;
import com.yt.app.api.v1.entity.Customerservices;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerservicesResourceAssembler extends ResourceAssemblerSupport<Customerservices, CustomerservicesResource> {
	public CustomerservicesResourceAssembler() {
		super(CustomerservicesController.class, CustomerservicesResource.class);
	}

	@Override
	public CustomerservicesResource toResource(Customerservices t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerservicesResource instantiateResource(Customerservices t) {
		return new CustomerservicesResource(t);
	}

}