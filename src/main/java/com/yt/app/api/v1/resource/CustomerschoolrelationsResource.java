package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerschoolrelationsController;
import com.yt.app.api.v1.entity.Customerschoolrelations;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomerschoolrelationsResource extends ResourceSupport {
	private final Customerschoolrelations t;

	public CustomerschoolrelationsResource(Customerschoolrelations entity) {
		this.t = entity;
		this.add(linkTo(CustomerschoolrelationsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerschoolrelationsController.class).list(null, null, null)).withRel("list"));

	}

	public Customerschoolrelations getCustomerschoolrelations() {
		return t;
	}

}