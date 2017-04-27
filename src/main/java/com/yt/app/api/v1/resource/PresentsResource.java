package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PresentsController;
import com.yt.app.api.v1.entity.Presents;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class PresentsResource extends ResourceSupport {
	private final Presents t;

	public PresentsResource(Presents entity) {
		this.t = entity;
		this.add(linkTo(PresentsController.class).withRel("post"));
		this.add(linkTo(methodOn(PresentsController.class).list(null, null, null)).withRel("list"));

	}

	public Presents getPresents() {
		return t;
	}

}