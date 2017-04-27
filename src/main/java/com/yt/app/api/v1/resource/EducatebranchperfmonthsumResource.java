package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatebranchperfmonthsumController;
import com.yt.app.api.v1.entity.Educatebranchperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatebranchperfmonthsumResource extends ResourceSupport {
	private final Educatebranchperfmonthsum t;

	public EducatebranchperfmonthsumResource(Educatebranchperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatebranchperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatebranchperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Educatebranchperfmonthsum getEducatebranchperfmonthsum() {
		return t;
	}

}