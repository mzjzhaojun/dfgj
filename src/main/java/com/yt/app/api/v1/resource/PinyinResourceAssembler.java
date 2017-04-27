package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PinyinController;
import com.yt.app.api.v1.entity.Pinyin;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class PinyinResourceAssembler extends ResourceAssemblerSupport<Pinyin, PinyinResource> {
	public PinyinResourceAssembler() {
		super(PinyinController.class, PinyinResource.class);
	}

	@Override
	public PinyinResource toResource(Pinyin t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected PinyinResource instantiateResource(Pinyin t) {
		return new PinyinResource(t);
	}

}