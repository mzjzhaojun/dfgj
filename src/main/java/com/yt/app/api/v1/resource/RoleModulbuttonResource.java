package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;

import com.yt.app.api.v1.controller.RoleModulbuttonController;
import com.yt.app.api.v1.entity.RoleModulbutton;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public class RoleModulbuttonResource extends ResourceSupport {
	private final RoleModulbutton e;

	public RoleModulbuttonResource(RoleModulbutton ee) {
		Long id = ee.getId();
		this.e = ee;
		this.add(linkTo(RoleModulbuttonController.class, id).withRel("collection"));

	}

	public RoleModulbutton getRoleModul_button() {
		return e;
	}

}