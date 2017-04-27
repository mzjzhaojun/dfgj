package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.RoleController;
import com.yt.app.api.v1.entity.Role;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public class RoleResourceAssembler extends ResourceAssemblerSupport<Role, RoleResource> {
	public RoleResourceAssembler() {
		super(RoleController.class, RoleResource.class);
	}

	@Override
	public RoleResource toResource(Role t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected RoleResource instantiateResource(Role t) {
		return new RoleResource(t);
	}

}