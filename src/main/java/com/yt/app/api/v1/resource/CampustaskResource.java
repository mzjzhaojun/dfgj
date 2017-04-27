package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampustaskController;
import com.yt.app.api.v1.entity.Campustask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class CampustaskResource extends ResourceSupport {
	private final Campustask t;

	public CampustaskResource(Campustask entity) {
		this.t = entity;
		this.add(linkTo(CampustaskController.class).withRel("post"));
		this.add(linkTo(methodOn(CampustaskController.class).list(null, null, null)).withRel("list"));

	}

	public Campustask getCampustask() {
		return t;
	}

}