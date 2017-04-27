package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomermeetingitemsController;
import com.yt.app.api.v1.entity.Customermeetingitems;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomermeetingitemsResourceAssembler extends ResourceAssemblerSupport<Customermeetingitems, CustomermeetingitemsResource> {
	public CustomermeetingitemsResourceAssembler() {
		super(CustomermeetingitemsController.class, CustomermeetingitemsResource.class);
	}

	@Override
	public CustomermeetingitemsResource toResource(Customermeetingitems t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CustomermeetingitemsResource instantiateResource(Customermeetingitems t) {
		return new CustomermeetingitemsResource(t);
	}

}