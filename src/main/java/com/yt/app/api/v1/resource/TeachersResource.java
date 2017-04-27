package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachersController;
import com.yt.app.api.v1.entity.Teachers;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

public class TeachersResource extends ResourceSupport {
	private final Teachers t;

	public TeachersResource(Teachers entity) {
		this.t = entity;
		this.add(linkTo(TeachersController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachersController.class).list(null, null, null)).withRel("list"));

	}

	public Teachers getTeachers() {
		return t;
	}

}