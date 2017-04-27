package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.UserOperationlogController;
import com.yt.app.api.v1.entity.UserOperationlog;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

public class UserOperationlogResource extends ResourceSupport {
	private final UserOperationlog t;

	public UserOperationlogResource(UserOperationlog entity) {
		this.t = entity;
		this.add(linkTo(UserOperationlogController.class).withRel("post"));
		this.add(linkTo(methodOn(UserOperationlogController.class).list(null, null, null)).withRel("list"));

	}

	public UserOperationlog getUserOperationlog() {
		return t;
	}

}