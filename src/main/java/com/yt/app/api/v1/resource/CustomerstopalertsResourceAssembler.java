package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerstopalertsController;
import com.yt.app.api.v1.entity.Customerstopalerts;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomerstopalertsResourceAssembler extends ResourceAssemblerSupport<Customerstopalerts, CustomerstopalertsResource> {
	public CustomerstopalertsResourceAssembler() {
		super(CustomerstopalertsController.class, CustomerstopalertsResource.class);
	}

	@Override
	public CustomerstopalertsResource toResource(Customerstopalerts t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerstopalertsResource instantiateResource(Customerstopalerts t) {
		return new CustomerstopalertsResource(t);
	}

}