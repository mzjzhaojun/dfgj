package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.yt.app.api.v1.controller.RoleModulbuttonController;
import com.yt.app.api.v1.entity.RoleModulbutton;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public class RoleModulbuttonResourceAssembler extends ResourceAssemblerSupport<RoleModulbutton, RoleModulbuttonResource> {
	public RoleModulbuttonResourceAssembler() {
		super(RoleModulbuttonController.class, RoleModulbuttonResource.class);
	}

	@Override
	public RoleModulbuttonResource toResource(RoleModulbutton e) {
		return createResourceWithId(e.getId(), e);
	}

	@Override
	protected RoleModulbuttonResource instantiateResource(RoleModulbutton e) {
		return new RoleModulbuttonResource(e);
	}

}