package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PresentsController;
import com.yt.app.api.v1.entity.Presents;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class PresentsResourceAssembler extends ResourceAssemblerSupport<Presents, PresentsResource> {
	public PresentsResourceAssembler() {
		super(PresentsController.class, PresentsResource.class);
	}

	@Override
	public PresentsResource toResource(Presents t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected PresentsResource instantiateResource(Presents t) {
		return new PresentsResource(t);
	}

}