package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomertransferassetsController;
import com.yt.app.api.v1.entity.Customertransferassets;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomertransferassetsResourceAssembler extends ResourceAssemblerSupport<Customertransferassets, CustomertransferassetsResource> {
	public CustomertransferassetsResourceAssembler() {
		super(CustomertransferassetsController.class, CustomertransferassetsResource.class);
	}

	@Override
	public CustomertransferassetsResource toResource(Customertransferassets t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomertransferassetsResource instantiateResource(Customertransferassets t) {
		return new CustomertransferassetsResource(t);
	}

}