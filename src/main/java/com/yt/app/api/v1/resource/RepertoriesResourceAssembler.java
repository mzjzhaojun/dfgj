package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.RepertoriesController;
import com.yt.app.api.v1.entity.Repertories;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class RepertoriesResourceAssembler extends ResourceAssemblerSupport<Repertories, RepertoriesResource> {
	public RepertoriesResourceAssembler() {
		super(RepertoriesController.class, RepertoriesResource.class);
	}

	@Override
	public RepertoriesResource toResource(Repertories t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected RepertoriesResource instantiateResource(Repertories t) {
		return new RepertoriesResource(t);
	}

}