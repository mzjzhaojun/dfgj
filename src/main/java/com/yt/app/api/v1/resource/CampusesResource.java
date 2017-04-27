package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusesController;
import com.yt.app.api.v1.entity.Campuses;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CampusesResource extends ResourceSupport {
	private final Campuses t;

	public CampusesResource(Campuses entity) {
		this.t = entity;
		this.add(linkTo(CampusesController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusesController.class).list(null, null, null)).withRel("list"));

	}

	public Campuses getCampuses() {
		return t;
	}

}