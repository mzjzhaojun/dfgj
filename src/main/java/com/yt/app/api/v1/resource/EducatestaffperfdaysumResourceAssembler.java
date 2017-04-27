package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatestaffperfdaysumController;
import com.yt.app.api.v1.entity.Educatestaffperfdaysum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatestaffperfdaysumResourceAssembler extends ResourceAssemblerSupport<Educatestaffperfdaysum, EducatestaffperfdaysumResource> {
	public EducatestaffperfdaysumResourceAssembler() {
		super(EducatestaffperfdaysumController.class, EducatestaffperfdaysumResource.class);
	}

	@Override
	public EducatestaffperfdaysumResource toResource(Educatestaffperfdaysum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected EducatestaffperfdaysumResource instantiateResource(Educatestaffperfdaysum t) {
		return new EducatestaffperfdaysumResource(t);
	}

}