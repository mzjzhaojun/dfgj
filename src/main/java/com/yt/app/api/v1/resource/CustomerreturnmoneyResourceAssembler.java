package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerreturnmoneyController;
import com.yt.app.api.v1.entity.Customerreturnmoney;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerreturnmoneyResourceAssembler extends ResourceAssemblerSupport<Customerreturnmoney, CustomerreturnmoneyResource> {
	public CustomerreturnmoneyResourceAssembler() {
		super(CustomerreturnmoneyController.class, CustomerreturnmoneyResource.class);
	}

	@Override
	public CustomerreturnmoneyResource toResource(Customerreturnmoney t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerreturnmoneyResource instantiateResource(Customerreturnmoney t) {
		return new CustomerreturnmoneyResource(t);
	}

}