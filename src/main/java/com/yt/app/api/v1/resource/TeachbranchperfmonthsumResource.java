package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachbranchperfmonthsumController;
import com.yt.app.api.v1.entity.Teachbranchperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class TeachbranchperfmonthsumResource extends ResourceSupport {
	private final Teachbranchperfmonthsum t;

	public TeachbranchperfmonthsumResource(Teachbranchperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachbranchperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachbranchperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachbranchperfmonthsum getTeachbranchperfmonthsum() {
		return t;
	}

}