package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrganizationsController;
import com.yt.app.api.v1.entity.Organizations;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:48
 */

public class OrganizationsResource extends ResourceSupport {
	private final Organizations t;

	public OrganizationsResource(Organizations entity) {
		this.t = entity;
		this.add(linkTo(OrganizationsController.class).withRel("post"));
		this.add(linkTo(methodOn(OrganizationsController.class).list(null, null, null)).withRel("list"));

	}

	public Organizations getOrganizations() {
		return t;
	}

}