package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerstaffrelationshipsController;
import com.yt.app.api.v1.entity.Customerstaffrelationships;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerstaffrelationshipsResource extends ResourceSupport {
	private final Customerstaffrelationships t;

	public CustomerstaffrelationshipsResource(Customerstaffrelationships entity) {
		this.t = entity;
		this.add(linkTo(CustomerstaffrelationshipsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerstaffrelationshipsController.class).list(null, null, null)).withRel("list"));

	}

	public Customerstaffrelationships getCustomerstaffrelationships() {
		return t;
	}

}