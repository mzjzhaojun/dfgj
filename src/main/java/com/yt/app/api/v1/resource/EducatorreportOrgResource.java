package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatorreportOrgController;
import com.yt.app.api.v1.entity.EducatorreportOrg;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class EducatorreportOrgResource extends ResourceSupport {
	private final EducatorreportOrg t;

	public EducatorreportOrgResource(EducatorreportOrg entity) {
		this.t = entity;
		this.add(linkTo(EducatorreportOrgController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatorreportOrgController.class).list(null, null, null)).withRel("list"));

	}

	public EducatorreportOrg getEducatorreportOrg() {
		return t;
	}

}