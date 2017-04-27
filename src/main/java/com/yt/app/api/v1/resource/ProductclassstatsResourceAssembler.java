package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ProductclassstatsController;
import com.yt.app.api.v1.entity.Productclassstats;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class ProductclassstatsResourceAssembler extends ResourceAssemblerSupport<Productclassstats, ProductclassstatsResource> {
	public ProductclassstatsResourceAssembler() {
		super(ProductclassstatsController.class, ProductclassstatsResource.class);
	}

	@Override
	public ProductclassstatsResource toResource(Productclassstats t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected ProductclassstatsResource instantiateResource(Productclassstats t) {
		return new ProductclassstatsResource(t);
	}

}