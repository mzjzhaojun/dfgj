package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatecountryperfmonthsumController;
import com.yt.app.api.v1.entity.Educatecountryperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class EducatecountryperfmonthsumResource extends ResourceSupport {
	private final Educatecountryperfmonthsum t;

	public EducatecountryperfmonthsumResource(Educatecountryperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatecountryperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatecountryperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Educatecountryperfmonthsum getEducatecountryperfmonthsum() {
		return t;
	}

}