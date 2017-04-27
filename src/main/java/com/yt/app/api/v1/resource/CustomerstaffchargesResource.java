package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerstaffchargesController;
import com.yt.app.api.v1.entity.Customerstaffcharges;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerstaffchargesResource extends ResourceSupport {
	private final Customerstaffcharges t;

	public CustomerstaffchargesResource(Customerstaffcharges entity) {
		this.t = entity;
		this.add(linkTo(CustomerstaffchargesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerstaffchargesController.class).list(null, null, null)).withRel("list"));

	}

	public Customerstaffcharges getCustomerstaffcharges() {
		return t;
	}

}