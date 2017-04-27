package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CachetsController;
import com.yt.app.api.v1.entity.Cachets;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class CachetsResourceAssembler extends ResourceAssemblerSupport<Cachets, CachetsResource> {
	public CachetsResourceAssembler() {
		super(CachetsController.class, CachetsResource.class);
	}

	@Override
	public CachetsResource toResource(Cachets t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CachetsResource instantiateResource(Cachets t) {
		return new CachetsResource(t);
	}

}