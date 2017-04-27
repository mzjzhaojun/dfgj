package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatestaffperfmonthsumController;
import com.yt.app.api.v1.entity.Educatestaffperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatestaffperfmonthsumResource extends ResourceSupport {
	private final Educatestaffperfmonthsum t;

	public EducatestaffperfmonthsumResource(Educatestaffperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatestaffperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatestaffperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Educatestaffperfmonthsum getEducatestaffperfmonthsum() {
		return t;
	}

}