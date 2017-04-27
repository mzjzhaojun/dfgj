package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.UserTaskcategoryController;
import com.yt.app.api.v1.entity.UserTaskcategory;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

public class UserTaskcategoryResource extends ResourceSupport {
	private final UserTaskcategory t;

	public UserTaskcategoryResource(UserTaskcategory entity) {
		this.t = entity;
		this.add(linkTo(UserTaskcategoryController.class).withRel("post"));
		this.add(linkTo(methodOn(UserTaskcategoryController.class).list(null, null, null)).withRel("list"));

	}

	public UserTaskcategory getUserTaskcategory() {
		return t;
	}

}