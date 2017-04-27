package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.DiscountsController;
import com.yt.app.api.v1.entity.Discounts;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class DiscountsResourceAssembler extends ResourceAssemblerSupport<Discounts, DiscountsResource> {
	public DiscountsResourceAssembler() {
		super(DiscountsController.class, DiscountsResource.class);
	}

	@Override
	public DiscountsResource toResource(Discounts t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected DiscountsResource instantiateResource(Discounts t) {
		return new DiscountsResource(t);
	}

}