package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherreportStaffController;
import com.yt.app.api.v1.entity.TeacherreportStaff;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

public class TeacherreportStaffResource extends ResourceSupport {
	private final TeacherreportStaff t;

	public TeacherreportStaffResource(TeacherreportStaff entity) {
		this.t = entity;
		this.add(linkTo(TeacherreportStaffController.class).withRel("post"));
		this.add(linkTo(methodOn(TeacherreportStaffController.class).list(null, null, null)).withRel("list"));

	}

	public TeacherreportStaff getTeacherreportStaff() {
		return t;
	}

}