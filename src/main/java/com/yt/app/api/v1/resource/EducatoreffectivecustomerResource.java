package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatoreffectivecustomerController;
import com.yt.app.api.v1.entity.Educatoreffectivecustomer;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatoreffectivecustomerResource extends ResourceSupport {
	private final Educatoreffectivecustomer t;

	public EducatoreffectivecustomerResource(Educatoreffectivecustomer entity) {
		this.t = entity;
		this.add(linkTo(EducatoreffectivecustomerController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatoreffectivecustomerController.class).list(null, null, null)).withRel("list"));

	}

	public Educatoreffectivecustomer getEducatoreffectivecustomer() {
		return t;
	}

}