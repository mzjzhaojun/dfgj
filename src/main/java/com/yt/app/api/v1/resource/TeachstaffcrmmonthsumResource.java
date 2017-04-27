package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachstaffcrmmonthsumController;
import com.yt.app.api.v1.entity.Teachstaffcrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

public class TeachstaffcrmmonthsumResource extends ResourceSupport {
	private final Teachstaffcrmmonthsum t;

	public TeachstaffcrmmonthsumResource(Teachstaffcrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachstaffcrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachstaffcrmmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachstaffcrmmonthsum getTeachstaffcrmmonthsum() {
		return t;
	}

}