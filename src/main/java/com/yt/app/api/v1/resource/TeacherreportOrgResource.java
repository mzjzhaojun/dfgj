package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherreportOrgController;
import com.yt.app.api.v1.entity.TeacherreportOrg;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

public class TeacherreportOrgResource extends ResourceSupport {
	private final TeacherreportOrg t;

	public TeacherreportOrgResource(TeacherreportOrg entity) {
		this.t = entity;
		this.add(linkTo(TeacherreportOrgController.class).withRel("post"));
		this.add(linkTo(methodOn(TeacherreportOrgController.class).list(null, null, null)).withRel("list"));

	}

	public TeacherreportOrg getTeacherreportOrg() {
		return t;
	}

}