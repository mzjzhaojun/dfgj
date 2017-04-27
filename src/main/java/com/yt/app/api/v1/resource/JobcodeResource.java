package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.JobcodeController;
import com.yt.app.api.v1.entity.Jobcode;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class JobcodeResource extends ResourceSupport {
	private final Jobcode t;

	public JobcodeResource(Jobcode entity) {
		this.t = entity;
		this.add(linkTo(JobcodeController.class).withRel("post"));
		this.add(linkTo(methodOn(JobcodeController.class).list(null, null, null)).withRel("list"));

	}

	public Jobcode getJobcode() {
		return t;
	}

}