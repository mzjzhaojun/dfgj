package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ProductpermissionsController;
import com.yt.app.api.v1.entity.Productpermissions;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class ProductpermissionsResource extends ResourceSupport {
	private final Productpermissions t;

	public ProductpermissionsResource(Productpermissions entity) {
		this.t = entity;
		this.add(linkTo(ProductpermissionsController.class).withRel("post"));
		this.add(linkTo(methodOn(ProductpermissionsController.class).list(null, null, null)).withRel("list"));

	}

	public Productpermissions getProductpermissions() {
		return t;
	}

}