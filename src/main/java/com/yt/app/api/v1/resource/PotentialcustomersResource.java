package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PotentialcustomersController;
import com.yt.app.api.v1.entity.Potentialcustomers;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class PotentialcustomersResource extends ResourceSupport {
	private final Potentialcustomers t;

	public PotentialcustomersResource(Potentialcustomers entity) {
		this.t = entity;
		this.add(linkTo(PotentialcustomersController.class).withRel("post"));
		this.add(linkTo(methodOn(PotentialcustomersController.class).list(null, null, null)).withRel("list"));

	}

	public Potentialcustomers getPotentialcustomers() {
		return t;
	}

}