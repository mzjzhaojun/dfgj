package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusrefundweeklystatController;
import com.yt.app.api.v1.entity.Campusrefundweeklystat;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class CampusrefundweeklystatResourceAssembler extends ResourceAssemblerSupport<Campusrefundweeklystat, CampusrefundweeklystatResource> {
	public CampusrefundweeklystatResourceAssembler() {
		super(CampusrefundweeklystatController.class, CampusrefundweeklystatResource.class);
	}

	@Override
	public CampusrefundweeklystatResource toResource(Campusrefundweeklystat t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CampusrefundweeklystatResource instantiateResource(Campusrefundweeklystat t) {
		return new CampusrefundweeklystatResource(t);
	}

}