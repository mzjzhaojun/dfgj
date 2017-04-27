package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ClasslessonsController;
import com.yt.app.api.v1.entity.Classlessons;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class ClasslessonsResource extends ResourceSupport {
	private final Classlessons t;

	public ClasslessonsResource(Classlessons entity) {
		this.t = entity;
		this.add(linkTo(ClasslessonsController.class).withRel("post"));
		this.add(linkTo(methodOn(ClasslessonsController.class).list(null, null, null)).withRel("list"));

	}

	public Classlessons getClasslessons() {
		return t;
	}

}