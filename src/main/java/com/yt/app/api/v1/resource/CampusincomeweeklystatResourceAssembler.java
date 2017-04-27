package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusincomeweeklystatController;
import com.yt.app.api.v1.entity.Campusincomeweeklystat;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CampusincomeweeklystatResourceAssembler extends ResourceAssemblerSupport<Campusincomeweeklystat, CampusincomeweeklystatResource> {
	public CampusincomeweeklystatResourceAssembler() {
		super(CampusincomeweeklystatController.class, CampusincomeweeklystatResource.class);
	}

	@Override
	public CampusincomeweeklystatResource toResource(Campusincomeweeklystat t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CampusincomeweeklystatResource instantiateResource(Campusincomeweeklystat t) {
		return new CampusincomeweeklystatResource(t);
	}

}