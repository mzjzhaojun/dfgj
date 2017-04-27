package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.StafftaskController;
import com.yt.app.api.v1.entity.Stafftask;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class StafftaskResourceAssembler extends ResourceAssemblerSupport<Stafftask, StafftaskResource> {
	public StafftaskResourceAssembler() {
		super(StafftaskController.class, StafftaskResource.class);
	}

	@Override
	public StafftaskResource toResource(Stafftask t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected StafftaskResource instantiateResource(Stafftask t) {
		return new StafftaskResource(t);
	}

}