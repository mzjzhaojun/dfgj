package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachcampusperfmonthsumController;
import com.yt.app.api.v1.entity.Teachcampusperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class TeachcampusperfmonthsumResource extends ResourceSupport {
	private final Teachcampusperfmonthsum t;

	public TeachcampusperfmonthsumResource(Teachcampusperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachcampusperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachcampusperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachcampusperfmonthsum getTeachcampusperfmonthsum() {
		return t;
	}

}