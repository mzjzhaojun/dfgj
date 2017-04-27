package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.RoleController;
import com.yt.app.api.v1.entity.Role;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public class RoleResource extends ResourceSupport {
	private final Role t;

	public RoleResource(Role entity) {
		this.t = entity;
		this.add(linkTo(RoleController.class).withRel("post"));
		this.add(linkTo(methodOn(RoleController.class).list(null, null, null)).withRel("list"));

	}

	public Role getRole() {
		return t;
	}

}