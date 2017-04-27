package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampustaskController;
import com.yt.app.api.v1.entity.Campustask;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class CampustaskResourceAssembler extends ResourceAssemblerSupport<Campustask, CampustaskResource> {
	public CampustaskResourceAssembler() {
		super(CampustaskController.class, CampustaskResource.class);
	}

	@Override
	public CampustaskResource toResource(Campustask t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CampustaskResource instantiateResource(Campustask t) {
		return new CampustaskResource(t);
	}

}