package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerassignsController;
import com.yt.app.api.v1.entity.Customerassigns;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerassignsResourceAssembler extends ResourceAssemblerSupport<Customerassigns, CustomerassignsResource> {
	public CustomerassignsResourceAssembler() {
		super(CustomerassignsController.class, CustomerassignsResource.class);
	}

	@Override
	public CustomerassignsResource toResource(Customerassigns t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerassignsResource instantiateResource(Customerassigns t) {
		return new CustomerassignsResource(t);
	}

}