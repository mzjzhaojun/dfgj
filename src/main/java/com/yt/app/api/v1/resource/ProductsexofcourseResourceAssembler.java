package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ProductsexofcourseController;
import com.yt.app.api.v1.entity.Productsexofcourse;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class ProductsexofcourseResourceAssembler extends ResourceAssemblerSupport<Productsexofcourse, ProductsexofcourseResource> {
	public ProductsexofcourseResourceAssembler() {
		super(ProductsexofcourseController.class, ProductsexofcourseResource.class);
	}

	@Override
	public ProductsexofcourseResource toResource(Productsexofcourse t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected ProductsexofcourseResource instantiateResource(Productsexofcourse t) {
		return new ProductsexofcourseResource(t);
	}

}