package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerstopalertsController;
import com.yt.app.api.v1.entity.Customerstopalerts;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerstopalertsResource extends ResourceSupport {
	private final Customerstopalerts t;

	public CustomerstopalertsResource(Customerstopalerts entity) {
		this.t = entity;
		this.add(linkTo(CustomerstopalertsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerstopalertsController.class).list(null, null, null)).withRel("list"));

	}

	public Customerstopalerts getCustomerstopalerts() {
		return t;
	}

}