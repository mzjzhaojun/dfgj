package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatecountryperfdaysumController;
import com.yt.app.api.v1.entity.Educatecountryperfdaysum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatecountryperfdaysumResource extends ResourceSupport {
	private final Educatecountryperfdaysum t;

	public EducatecountryperfdaysumResource(Educatecountryperfdaysum entity) {
		this.t = entity;
		this.add(linkTo(EducatecountryperfdaysumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatecountryperfdaysumController.class).list(null, null, null)).withRel("list"));

	}

	public Educatecountryperfdaysum getEducatecountryperfdaysum() {
		return t;
	}

}