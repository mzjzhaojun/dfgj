package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerteacherrelationsController;
import com.yt.app.api.v1.entity.Customerteacherrelations;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomerteacherrelationsResourceAssembler extends ResourceAssemblerSupport<Customerteacherrelations, CustomerteacherrelationsResource> {
	public CustomerteacherrelationsResourceAssembler() {
		super(CustomerteacherrelationsController.class, CustomerteacherrelationsResource.class);
	}

	@Override
	public CustomerteacherrelationsResource toResource(Customerteacherrelations t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomerteacherrelationsResource instantiateResource(Customerteacherrelations t) {
		return new CustomerteacherrelationsResource(t);
	}

}