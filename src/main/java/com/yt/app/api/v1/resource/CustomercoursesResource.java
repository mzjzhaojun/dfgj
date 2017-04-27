package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomercoursesController;
import com.yt.app.api.v1.entity.Customercourses;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomercoursesResource extends ResourceSupport {
	private final Customercourses t;

	public CustomercoursesResource(Customercourses entity) {
		this.t = entity;
		this.add(linkTo(CustomercoursesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomercoursesController.class).list(null, null, null)).withRel("list"));

	}

	public Customercourses getCustomercourses() {
		return t;
	}

}