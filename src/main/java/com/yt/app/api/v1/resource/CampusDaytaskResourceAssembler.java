package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusDaytaskController;
import com.yt.app.api.v1.entity.CampusDaytask;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class CampusDaytaskResourceAssembler extends ResourceAssemblerSupport<CampusDaytask, CampusDaytaskResource> {
	public CampusDaytaskResourceAssembler() {
		super(CampusDaytaskController.class, CampusDaytaskResource.class);
	}

	@Override
	public CampusDaytaskResource toResource(CampusDaytask t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CampusDaytaskResource instantiateResource(CampusDaytask t) {
		return new CampusDaytaskResource(t);
	}

}