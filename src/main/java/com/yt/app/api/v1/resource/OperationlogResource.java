package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OperationlogController;
import com.yt.app.api.v1.entity.Operationlog;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class OperationlogResource extends ResourceSupport {
	private final Operationlog t;

	public OperationlogResource(Operationlog entity) {
		this.t = entity;
		this.add(linkTo(OperationlogController.class).withRel("post"));
		this.add(linkTo(methodOn(OperationlogController.class).list(null, null, null)).withRel("list"));

	}

	public Operationlog getOperationlog() {
		return t;
	}

}