package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.StaffbasestatController;
import com.yt.app.api.v1.entity.Staffbasestat;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class StaffbasestatResourceAssembler extends ResourceAssemblerSupport<Staffbasestat, StaffbasestatResource> {
	public StaffbasestatResourceAssembler() {
		super(StaffbasestatController.class, StaffbasestatResource.class);
	}

	@Override
	public StaffbasestatResource toResource(Staffbasestat t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected StaffbasestatResource instantiateResource(Staffbasestat t) {
		return new StaffbasestatResource(t);
	}

}