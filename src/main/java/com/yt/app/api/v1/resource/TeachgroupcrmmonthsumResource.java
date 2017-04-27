package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachgroupcrmmonthsumController;
import com.yt.app.api.v1.entity.Teachgroupcrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

public class TeachgroupcrmmonthsumResource extends ResourceSupport {
	private final Teachgroupcrmmonthsum t;

	public TeachgroupcrmmonthsumResource(Teachgroupcrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachgroupcrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachgroupcrmmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Teachgroupcrmmonthsum getTeachgroupcrmmonthsum() {
		return t;
	}

}