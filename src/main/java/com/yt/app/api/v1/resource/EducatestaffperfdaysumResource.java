package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatestaffperfdaysumController;
import com.yt.app.api.v1.entity.Educatestaffperfdaysum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatestaffperfdaysumResource extends ResourceSupport {
	private final Educatestaffperfdaysum t;

	public EducatestaffperfdaysumResource(Educatestaffperfdaysum entity) {
		this.t = entity;
		this.add(linkTo(EducatestaffperfdaysumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatestaffperfdaysumController.class).list(null, null, null)).withRel("list"));

	}

	public Educatestaffperfdaysum getEducatestaffperfdaysum() {
		return t;
	}

}