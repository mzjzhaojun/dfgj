package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountreturnappliesController;
import com.yt.app.api.v1.entity.Accountreturnapplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class AccountreturnappliesResource extends ResourceSupport {
	private final Accountreturnapplies t;

	public AccountreturnappliesResource(Accountreturnapplies entity) {
		this.t = entity;
		this.add(linkTo(AccountreturnappliesController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountreturnappliesController.class).list(null, null, null)).withRel("list"));

	}

	public Accountreturnapplies getAccountreturnapplies() {
		return t;
	}

}