package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatebranchperfdaysumController;
import com.yt.app.api.v1.entity.Educatebranchperfdaysum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatebranchperfdaysumResourceAssembler extends ResourceAssemblerSupport<Educatebranchperfdaysum, EducatebranchperfdaysumResource> {
	public EducatebranchperfdaysumResourceAssembler() {
		super(EducatebranchperfdaysumController.class, EducatebranchperfdaysumResource.class);
	}

	@Override
	public EducatebranchperfdaysumResource toResource(Educatebranchperfdaysum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected EducatebranchperfdaysumResource instantiateResource(Educatebranchperfdaysum t) {
		return new EducatebranchperfdaysumResource(t);
	}

}