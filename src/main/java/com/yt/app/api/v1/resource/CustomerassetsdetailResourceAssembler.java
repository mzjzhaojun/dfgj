package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerassetsdetailController;
import com.yt.app.api.v1.entity.Customerassetsdetail;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerassetsdetailResourceAssembler extends ResourceAssemblerSupport<Customerassetsdetail, CustomerassetsdetailResource> {
	public CustomerassetsdetailResourceAssembler() {
		super(CustomerassetsdetailController.class, CustomerassetsdetailResource.class);
	}

	@Override
	public CustomerassetsdetailResource toResource(Customerassetsdetail t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerassetsdetailResource instantiateResource(Customerassetsdetail t) {
		return new CustomerassetsdetailResource(t);
	}

}