package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AssignconditionsController;
import com.yt.app.api.v1.entity.Assignconditions;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class AssignconditionsResource extends ResourceSupport {
	private final Assignconditions t;

	public AssignconditionsResource(Assignconditions entity) {
		this.t = entity;
		this.add(linkTo(AssignconditionsController.class).withRel("post"));
		this.add(linkTo(methodOn(AssignconditionsController.class).list(null, null, null)).withRel("list"));

	}

	public Assignconditions getAssignconditions() {
		return t;
	}

}