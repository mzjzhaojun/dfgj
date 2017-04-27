package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AssignsaccompaniesController;
import com.yt.app.api.v1.entity.Assignsaccompanies;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class AssignsaccompaniesResourceAssembler extends ResourceAssemblerSupport<Assignsaccompanies, AssignsaccompaniesResource> {
	public AssignsaccompaniesResourceAssembler() {
		super(AssignsaccompaniesController.class, AssignsaccompaniesResource.class);
	}

	@Override
	public AssignsaccompaniesResource toResource(Assignsaccompanies t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected AssignsaccompaniesResource instantiateResource(Assignsaccompanies t) {
		return new AssignsaccompaniesResource(t);
	}

}