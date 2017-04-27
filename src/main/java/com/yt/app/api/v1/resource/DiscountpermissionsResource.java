package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.DiscountpermissionsController;
import com.yt.app.api.v1.entity.Discountpermissions;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class DiscountpermissionsResource extends ResourceSupport {
	private final Discountpermissions t;

	public DiscountpermissionsResource(Discountpermissions entity) {
		this.t = entity;
		this.add(linkTo(DiscountpermissionsController.class).withRel("post"));
		this.add(linkTo(methodOn(DiscountpermissionsController.class).list(null, null, null)).withRel("list"));

	}

	public Discountpermissions getDiscountpermissions() {
		return t;
	}

}