package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatorreportStaffController;
import com.yt.app.api.v1.entity.EducatorreportStaff;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatorreportStaffResource extends ResourceSupport {
	private final EducatorreportStaff t;

	public EducatorreportStaffResource(EducatorreportStaff entity) {
		this.t = entity;
		this.add(linkTo(EducatorreportStaffController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatorreportStaffController.class).list(null, null, null)).withRel("list"));

	}

	public EducatorreportStaff getEducatorreportStaff() {
		return t;
	}

}