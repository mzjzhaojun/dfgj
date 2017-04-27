package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.SchoolsController;
import com.yt.app.api.v1.entity.Schools;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class SchoolsResource extends ResourceSupport {
	private final Schools t;

	public SchoolsResource(Schools entity) {
		this.t = entity;
		this.add(linkTo(SchoolsController.class).withRel("post"));
		this.add(linkTo(methodOn(SchoolsController.class).list(null, null, null)).withRel("list"));

	}

	public Schools getSchools() {
		return t;
	}

}