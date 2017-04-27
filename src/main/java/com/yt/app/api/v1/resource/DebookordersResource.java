package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.DebookordersController;
import com.yt.app.api.v1.entity.Debookorders;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class DebookordersResource extends ResourceSupport {
	private final Debookorders t;

	public DebookordersResource(Debookorders entity) {
		this.t = entity;
		this.add(linkTo(DebookordersController.class).withRel("post"));
		this.add(linkTo(methodOn(DebookordersController.class).list(null, null, null)).withRel("list"));

	}

	public Debookorders getDebookorders() {
		return t;
	}

}