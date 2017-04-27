package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatorreportOrgController;
import com.yt.app.api.v1.entity.EducatorreportOrg;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatorreportOrgResourceAssembler extends ResourceAssemblerSupport<EducatorreportOrg, EducatorreportOrgResource> {
	public EducatorreportOrgResourceAssembler() {
		super(EducatorreportOrgController.class, EducatorreportOrgResource.class);
	}

	@Override
	public EducatorreportOrgResource toResource(EducatorreportOrg t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected EducatorreportOrgResource instantiateResource(EducatorreportOrg t) {
		return new EducatorreportOrgResource(t);
	}

}