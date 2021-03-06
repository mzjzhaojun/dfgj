package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.UserTaskController;
import com.yt.app.api.v1.entity.UserTask;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

public class UserTaskResourceAssembler extends ResourceAssemblerSupport<UserTask, UserTaskResource> {
	public UserTaskResourceAssembler() {
		super(UserTaskController.class, UserTaskResource.class);
	}

	@Override
	public UserTaskResource toResource(UserTask t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected UserTaskResource instantiateResource(UserTask t) {
		return new UserTaskResource(t);
	}

}