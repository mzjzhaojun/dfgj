package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ProductsalaryrulesController;
import com.yt.app.api.v1.entity.Productsalaryrules;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class ProductsalaryrulesResourceAssembler extends ResourceAssemblerSupport<Productsalaryrules, ProductsalaryrulesResource> {
	public ProductsalaryrulesResourceAssembler() {
		super(ProductsalaryrulesController.class, ProductsalaryrulesResource.class);
	}

	@Override
	public ProductsalaryrulesResource toResource(Productsalaryrules t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected ProductsalaryrulesResource instantiateResource(Productsalaryrules t) {
		return new ProductsalaryrulesResource(t);
	}

}