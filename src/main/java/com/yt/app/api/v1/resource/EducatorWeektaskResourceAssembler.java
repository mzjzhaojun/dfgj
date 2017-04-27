package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatorWeektaskController;
import com.yt.app.api.v1.entity.EducatorWeektask;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class EducatorWeektaskResourceAssembler extends ResourceAssemblerSupport<EducatorWeektask, EducatorWeektaskResource> {
	public EducatorWeektaskResourceAssembler() {
		super(EducatorWeektaskController.class, EducatorWeektaskResource.class);
	}

	@Override
	public EducatorWeektaskResource toResource(EducatorWeektask t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected EducatorWeektaskResource instantiateResource(EducatorWeektask t) {
		return new EducatorWeektaskResource(t);
	}

}