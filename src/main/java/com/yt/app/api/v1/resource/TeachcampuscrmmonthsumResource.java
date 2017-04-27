package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachcampuscrmmonthsumController;
import com.yt.app.api.v1.entity.Teachcampuscrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class TeachcampuscrmmonthsumResource extends ResourceSupport {
	private final Teachcampuscrmmonthsum t;

	public TeachcampuscrmmonthsumResource(Teachcampuscrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachcampuscrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachcampuscrmmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachcampuscrmmonthsum getTeachcampuscrmmonthsum() {
		return t;
	}

}