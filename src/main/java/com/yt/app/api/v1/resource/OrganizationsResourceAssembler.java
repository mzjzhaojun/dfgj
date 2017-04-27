package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrganizationsController;
import com.yt.app.api.v1.entity.Organizations;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:48
 */

public class OrganizationsResourceAssembler extends ResourceAssemblerSupport<Organizations, OrganizationsResource> {
	public OrganizationsResourceAssembler() {
		super(OrganizationsController.class, OrganizationsResource.class);
	}

	@Override
	public OrganizationsResource toResource(Organizations t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected OrganizationsResource instantiateResource(Organizations t) {
		return new OrganizationsResource(t);
	}

}