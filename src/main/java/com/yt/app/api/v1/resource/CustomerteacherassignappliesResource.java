package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerteacherassignappliesController;
import com.yt.app.api.v1.entity.Customerteacherassignapplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerteacherassignappliesResource extends ResourceSupport {
	private final Customerteacherassignapplies t;

	public CustomerteacherassignappliesResource(Customerteacherassignapplies entity) {
		this.t = entity;
		this.add(linkTo(CustomerteacherassignappliesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerteacherassignappliesController.class).list(null, null, null)).withRel("list"));

	}

	public Customerteacherassignapplies getCustomerteacherassignapplies() {
		return t;
	}

}