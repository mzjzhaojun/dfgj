package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ParentsController;
import com.yt.app.api.v1.entity.Parents;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class ParentsResource extends ResourceSupport {
	private final Parents t;

	public ParentsResource(Parents entity) {
		this.t = entity;
		this.add(linkTo(ParentsController.class).withRel("post"));
		this.add(linkTo(methodOn(ParentsController.class).list(null, null, null)).withRel("list"));

	}

	public Parents getParents() {
		return t;
	}

}