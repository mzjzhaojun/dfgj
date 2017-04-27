package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.JobsController;
import com.yt.app.api.v1.entity.Jobs;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class JobsResource extends ResourceSupport {
	private final Jobs t;

	public JobsResource(Jobs entity) {
		this.t = entity;
		this.add(linkTo(JobsController.class).withRel("post"));
		this.add(linkTo(methodOn(JobsController.class).list(null, null, null)).withRel("list"));

	}

	public Jobs getJobs() {
		return t;
	}

}