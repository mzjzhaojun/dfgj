package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerscoreitemsController;
import com.yt.app.api.v1.entity.Customerscoreitems;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomerscoreitemsResourceAssembler extends ResourceAssemblerSupport<Customerscoreitems, CustomerscoreitemsResource> {
	public CustomerscoreitemsResourceAssembler() {
		super(CustomerscoreitemsController.class, CustomerscoreitemsResource.class);
	}

	@Override
	public CustomerscoreitemsResource toResource(Customerscoreitems t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerscoreitemsResource instantiateResource(Customerscoreitems t) {
		return new CustomerscoreitemsResource(t);
	}

}