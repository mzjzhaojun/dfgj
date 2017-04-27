package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatecampuscrmmonthsumController;
import com.yt.app.api.v1.entity.Educatecampuscrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class EducatecampuscrmmonthsumResource extends ResourceSupport {
	private final Educatecampuscrmmonthsum t;

	public EducatecampuscrmmonthsumResource(Educatecampuscrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatecampuscrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatecampuscrmmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Educatecampuscrmmonthsum getEducatecampuscrmmonthsum() {
		return t;
	}

}