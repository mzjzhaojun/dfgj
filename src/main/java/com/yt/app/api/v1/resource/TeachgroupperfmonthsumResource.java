package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachgroupperfmonthsumController;
import com.yt.app.api.v1.entity.Teachgroupperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

public class TeachgroupperfmonthsumResource extends ResourceSupport {
	private final Teachgroupperfmonthsum t;

	public TeachgroupperfmonthsumResource(Teachgroupperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachgroupperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachgroupperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachgroupperfmonthsum getTeachgroupperfmonthsum() {
		return t;
	}

}