package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomertransferaccountsController;
import com.yt.app.api.v1.entity.Customertransferaccounts;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomertransferaccountsResourceAssembler extends ResourceAssemblerSupport<Customertransferaccounts, CustomertransferaccountsResource> {
	public CustomertransferaccountsResourceAssembler() {
		super(CustomertransferaccountsController.class, CustomertransferaccountsResource.class);
	}

	@Override
	public CustomertransferaccountsResource toResource(Customertransferaccounts t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomertransferaccountsResource instantiateResource(Customertransferaccounts t) {
		return new CustomertransferaccountsResource(t);
	}

}