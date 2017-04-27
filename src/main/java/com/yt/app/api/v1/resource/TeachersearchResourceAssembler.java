package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachersearchController;
import com.yt.app.api.v1.entity.Teachersearch;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

public class TeachersearchResourceAssembler extends ResourceAssemblerSupport<Teachersearch, TeachersearchResource> {
	public TeachersearchResourceAssembler() {
		super(TeachersearchController.class, TeachersearchResource.class);
	}

	@Override
	public TeachersearchResource toResource(Teachersearch t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected TeachersearchResource instantiateResource(Teachersearch t) {
		return new TeachersearchResource(t);
	}

}