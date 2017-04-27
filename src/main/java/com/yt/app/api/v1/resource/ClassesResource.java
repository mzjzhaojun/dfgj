package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ClassesController;
import com.yt.app.api.v1.entity.Classes;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class ClassesResource extends ResourceSupport {
	private final Classes t;

	public ClassesResource(Classes entity) {
		this.t = entity;
		this.add(linkTo(ClassesController.class).withRel("post"));
		this.add(linkTo(methodOn(ClassesController.class).list(null, null, null)).withRel("list"));

	}

	public Classes getClasses() {
		return t;
	}

}