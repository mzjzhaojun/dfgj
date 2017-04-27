package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.DiscountitemsController;
import com.yt.app.api.v1.entity.Discountitems;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class DiscountitemsResourceAssembler extends ResourceAssemblerSupport<Discountitems, DiscountitemsResource> {
	public DiscountitemsResourceAssembler() {
		super(DiscountitemsController.class, DiscountitemsResource.class);
	}

	@Override
	public DiscountitemsResource toResource(Discountitems t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected DiscountitemsResource instantiateResource(Discountitems t) {
		return new DiscountitemsResource(t);
	}

}