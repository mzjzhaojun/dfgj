package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatestaffcrmmonthsumController;
import com.yt.app.api.v1.entity.Educatestaffcrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatestaffcrmmonthsumResource extends ResourceSupport {
	private final Educatestaffcrmmonthsum t;

	public EducatestaffcrmmonthsumResource(Educatestaffcrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatestaffcrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatestaffcrmmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Educatestaffcrmmonthsum getEducatestaffcrmmonthsum() {
		return t;
	}

}