package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.StafftaskController;
import com.yt.app.api.v1.entity.Stafftask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class StafftaskResource extends ResourceSupport {
	private final Stafftask t;

	public StafftaskResource(Stafftask entity) {
		this.t = entity;
		this.add(linkTo(StafftaskController.class).withRel("post"));
		this.add(linkTo(methodOn(StafftaskController.class).list(null, null, null)).withRel("list"));

	}

	public Stafftask getStafftask() {
		return t;
	}

}