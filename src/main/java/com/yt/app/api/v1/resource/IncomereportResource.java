package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.IncomereportController;
import com.yt.app.api.v1.entity.Incomereport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class IncomereportResource extends ResourceSupport {
	private final Incomereport t;

	public IncomereportResource(Incomereport entity) {
		this.t = entity;
		this.add(linkTo(IncomereportController.class).withRel("post"));
		this.add(linkTo(methodOn(IncomereportController.class).list(null, null, null)).withRel("list"));

	}

	public Incomereport getIncomereport() {
		return t;
	}

}