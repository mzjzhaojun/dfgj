package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.LinkController;
import com.yt.app.api.v1.entity.Link;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:17:35
 */

public class LinkResource extends ResourceSupport {
	private final Link t;

	public LinkResource(Link entity) {
		this.t = entity;
		this.add(linkTo(LinkController.class).withRel("post"));
		this.add(linkTo(methodOn(LinkController.class).list(null, null, null)).withRel("list"));

	}

	public Link getLink() {
		return t;
	}

}