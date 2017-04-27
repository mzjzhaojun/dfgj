package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerrefundalertsController;
import com.yt.app.api.v1.entity.Customerrefundalerts;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerrefundalertsResource extends ResourceSupport {
	private final Customerrefundalerts t;

	public CustomerrefundalertsResource(Customerrefundalerts entity) {
		this.t = entity;
		this.add(linkTo(CustomerrefundalertsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerrefundalertsController.class).list(null, null, null)).withRel("list"));

	}

	public Customerrefundalerts getCustomerrefundalerts() {
		return t;
	}

}