package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.RoleMenuController;
import com.yt.app.api.v1.entity.RoleMenu;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public class RoleMenuResource extends ResourceSupport {
	private final RoleMenu t;

	public RoleMenuResource(RoleMenu entity) {
		this.t = entity;
		this.add(linkTo(RoleMenuController.class).withRel("post"));
		this.add(linkTo(methodOn(RoleMenuController.class).list(null, null, null)).withRel("list"));

	}

	public RoleMenu getRoleMenu() {
		return t;
	}

}