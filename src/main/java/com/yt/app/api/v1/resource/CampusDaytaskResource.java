package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusDaytaskController;
import com.yt.app.api.v1.entity.CampusDaytask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class CampusDaytaskResource extends ResourceSupport {
	private final CampusDaytask t;

	public CampusDaytaskResource(CampusDaytask entity) {
		this.t = entity;
		this.add(linkTo(CampusDaytaskController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusDaytaskController.class).list(null, null, null)).withRel("list"));

	}

	public CampusDaytask getCampusDaytask() {
		return t;
	}

}