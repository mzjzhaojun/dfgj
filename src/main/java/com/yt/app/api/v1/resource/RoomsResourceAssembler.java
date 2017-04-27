package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.RoomsController;
import com.yt.app.api.v1.entity.Rooms;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class RoomsResourceAssembler extends ResourceAssemblerSupport<Rooms, RoomsResource> {
	public RoomsResourceAssembler() {
		super(RoomsController.class, RoomsResource.class);
	}

	@Override
	public RoomsResource toResource(Rooms t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected RoomsResource instantiateResource(Rooms t) {
		return new RoomsResource(t);
	}

}