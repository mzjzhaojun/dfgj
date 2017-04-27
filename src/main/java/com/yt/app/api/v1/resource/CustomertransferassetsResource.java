package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomertransferassetsController;
import com.yt.app.api.v1.entity.Customertransferassets;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class CustomertransferassetsResource extends ResourceSupport {
	private final Customertransferassets t;

	public CustomertransferassetsResource(Customertransferassets entity) {
		this.t = entity;
		this.add(linkTo(CustomertransferassetsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomertransferassetsController.class).list(null, null, null)).withRel("list"));

	}

	public Customertransferassets getCustomertransferassets() {
		return t;
	}

}