package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.RoleMenuController;
import com.yt.app.api.v1.entity.RoleMenu;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public class RoleMenuResourceAssembler extends ResourceAssemblerSupport<RoleMenu, RoleMenuResource> {
	public RoleMenuResourceAssembler() {
		super(RoleMenuController.class, RoleMenuResource.class);
	}

	@Override
	public RoleMenuResource toResource(RoleMenu t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected RoleMenuResource instantiateResource(RoleMenu t) {
		return new RoleMenuResource(t);
	}

}