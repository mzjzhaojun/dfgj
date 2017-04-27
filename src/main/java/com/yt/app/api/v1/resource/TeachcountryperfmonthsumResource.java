package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachcountryperfmonthsumController;
import com.yt.app.api.v1.entity.Teachcountryperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class TeachcountryperfmonthsumResource extends ResourceSupport {
	private final Teachcountryperfmonthsum t;

	public TeachcountryperfmonthsumResource(Teachcountryperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachcountryperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachcountryperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachcountryperfmonthsum getTeachcountryperfmonthsum() {
		return t;
	}

}