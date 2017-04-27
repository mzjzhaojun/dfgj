package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ClasslessonitemsController;
import com.yt.app.api.v1.entity.Classlessonitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class ClasslessonitemsResource extends ResourceSupport {
	private final Classlessonitems t;

	public ClasslessonitemsResource(Classlessonitems entity) {
		this.t = entity;
		this.add(linkTo(ClasslessonitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(ClasslessonitemsController.class).list(null, null, null)).withRel("list"));

	}

	public Classlessonitems getClasslessonitems() {
		return t;
	}

}