package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerparentrelationsController;
import com.yt.app.api.v1.entity.Customerparentrelations;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerparentrelationsResourceAssembler extends ResourceAssemblerSupport<Customerparentrelations, CustomerparentrelationsResource> {
	public CustomerparentrelationsResourceAssembler() {
		super(CustomerparentrelationsController.class, CustomerparentrelationsResource.class);
	}

	@Override
	public CustomerparentrelationsResource toResource(Customerparentrelations t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerparentrelationsResource instantiateResource(Customerparentrelations t) {
		return new CustomerparentrelationsResource(t);
	}

}