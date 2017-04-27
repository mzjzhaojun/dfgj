package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerrepliesController;
import com.yt.app.api.v1.entity.Customerreplies;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerrepliesResourceAssembler extends ResourceAssemblerSupport<Customerreplies, CustomerrepliesResource> {
	public CustomerrepliesResourceAssembler() {
		super(CustomerrepliesController.class, CustomerrepliesResource.class);
	}

	@Override
	public CustomerrepliesResource toResource(Customerreplies t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerrepliesResource instantiateResource(Customerreplies t) {
		return new CustomerrepliesResource(t);
	}

}