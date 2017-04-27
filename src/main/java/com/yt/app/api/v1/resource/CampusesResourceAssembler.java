package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusesController;
import com.yt.app.api.v1.entity.Campuses;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CampusesResourceAssembler extends ResourceAssemblerSupport<Campuses, CampusesResource> {
	public CampusesResourceAssembler() {
		super(CampusesController.class, CampusesResource.class);
	}

	@Override
	public CampusesResource toResource(Campuses t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CampusesResource instantiateResource(Campuses t) {
		return new CampusesResource(t);
	}

}