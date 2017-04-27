package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachbranchcrmmonthsumController;
import com.yt.app.api.v1.entity.Teachbranchcrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class TeachbranchcrmmonthsumResource extends ResourceSupport {
	private final Teachbranchcrmmonthsum t;

	public TeachbranchcrmmonthsumResource(Teachbranchcrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachbranchcrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachbranchcrmmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachbranchcrmmonthsum getTeachbranchcrmmonthsum() {
		return t;
	}

}