package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerreturnmoneyController;
import com.yt.app.api.v1.entity.Customerreturnmoney;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomerreturnmoneyResource extends ResourceSupport {
	private final Customerreturnmoney t;

	public CustomerreturnmoneyResource(Customerreturnmoney entity) {
		this.t = entity;
		this.add(linkTo(CustomerreturnmoneyController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerreturnmoneyController.class).list(null, null, null)).withRel("list"));

	}

	public Customerreturnmoney getCustomerreturnmoney() {
		return t;
	}

}