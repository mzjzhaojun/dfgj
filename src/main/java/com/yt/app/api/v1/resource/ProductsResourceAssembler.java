package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ProductsController;
import com.yt.app.api.v1.entity.Products;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:54
*/

public class ProductsResourceAssembler extends ResourceAssemblerSupport<Products, ProductsResource> {
	public ProductsResourceAssembler() {
		super(ProductsController.class, ProductsResource.class);
	}
	@Override	public ProductsResource toResource(Products t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ProductsResource instantiateResource(Products t) {
		return new ProductsResource(t);
	}

}