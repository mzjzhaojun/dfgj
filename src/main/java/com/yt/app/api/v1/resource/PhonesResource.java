package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PhonesController;
import com.yt.app.api.v1.entity.Phones;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class PhonesResource extends ResourceSupport {
	private final Phones t;

	public PhonesResource(Phones entity) {
		this.t = entity;
		this.add(linkTo(PhonesController.class).withRel("post"));
		this.add(linkTo(methodOn(PhonesController.class).list(null, null, null)).withRel("list"));

	}

	public Phones getPhones() {
		return t;
	}

}