package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerteacherrelationsController;
import com.yt.app.api.v1.entity.Customerteacherrelations;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerteacherrelationsResource extends ResourceSupport {
	private final Customerteacherrelations t;

	public CustomerteacherrelationsResource(Customerteacherrelations entity) {
		this.t = entity;
		this.add(linkTo(CustomerteacherrelationsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerteacherrelationsController.class).list(null, null, null)).withRel("list"));

	}

	public Customerteacherrelations getCustomerteacherrelations() {
		return t;
	}

}