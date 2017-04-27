package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.StaffrefundstatController;
import com.yt.app.api.v1.entity.Staffrefundstat;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class StaffrefundstatResourceAssembler extends ResourceAssemblerSupport<Staffrefundstat, StaffrefundstatResource> {
	public StaffrefundstatResourceAssembler() {
		super(StaffrefundstatController.class, StaffrefundstatResource.class);
	}

	@Override
	public StaffrefundstatResource toResource(Staffrefundstat t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected StaffrefundstatResource instantiateResource(Staffrefundstat t) {
		return new StaffrefundstatResource(t);
	}

}