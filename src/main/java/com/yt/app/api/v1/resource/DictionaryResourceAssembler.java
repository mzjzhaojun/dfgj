package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.DictionaryController;
import com.yt.app.api.v1.entity.Dictionary;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-19 17:03:14
 */

public class DictionaryResourceAssembler extends ResourceAssemblerSupport<Dictionary, DictionaryResource> {
	public DictionaryResourceAssembler() {
		super(DictionaryController.class, DictionaryResource.class);
	}

	@Override
	public DictionaryResource toResource(Dictionary t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected DictionaryResource instantiateResource(Dictionary t) {
		return new DictionaryResource(t);
	}

}