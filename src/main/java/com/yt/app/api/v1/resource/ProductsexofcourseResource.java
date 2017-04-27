package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ProductsexofcourseController;
import com.yt.app.api.v1.entity.Productsexofcourse;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class ProductsexofcourseResource extends ResourceSupport {
	private final Productsexofcourse t;

	public ProductsexofcourseResource(Productsexofcourse entity) {
		this.t = entity;
		this.add(linkTo(ProductsexofcourseController.class).withRel("post"));
		this.add(linkTo(methodOn(ProductsexofcourseController.class).list(null, null, null)).withRel("list"));

	}

	public Productsexofcourse getProductsexofcourse() {
		return t;
	}

}