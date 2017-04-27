package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ProductsController;
import com.yt.app.api.v1.entity.Products;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class ProductsResource extends ResourceSupport {
	private final Products t;

	public ProductsResource(Products entity) {
		this.t = entity;
		this.add(linkTo(ProductsController.class).withRel("post"));
		this.add(linkTo(methodOn(ProductsController.class).list(null, null, null)).withRel("list"));

	}

	public Products getProducts() {
		return t;
	}

}