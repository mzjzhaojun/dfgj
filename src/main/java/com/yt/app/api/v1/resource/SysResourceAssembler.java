package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.SysController;
import com.yt.app.api.v1.entity.Sys;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public class SysResourceAssembler extends ResourceAssemblerSupport<Sys, SysResource> {
	public SysResourceAssembler() {
		super(SysController.class, SysResource.class);
	}

	@Override
	public SysResource toResource(Sys t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected SysResource instantiateResource(Sys t) {
		return new SysResource(t);
	}

}