package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountdeductappliesController;
import com.yt.app.api.v1.entity.Accountdeductapplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class AccountdeductappliesResource extends ResourceSupport {
	private final Accountdeductapplies t;

	public AccountdeductappliesResource(Accountdeductapplies entity) {
		this.t = entity;
		this.add(linkTo(AccountdeductappliesController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountdeductappliesController.class).list(null, null, null)).withRel("list"));

	}

	public Accountdeductapplies getAccountdeductapplies() {
		return t;
	}

}