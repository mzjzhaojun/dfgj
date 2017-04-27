package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountRoleController;
import com.yt.app.api.v1.entity.AccountRole;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-27 17:32:56
 */

public class AccountRoleResource extends ResourceSupport {
	private final AccountRole t;

	public AccountRoleResource(AccountRole entity) {
		this.t = entity;
		this.add(linkTo(AccountRoleController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountRoleController.class).list(null, null, null)).withRel("list"));

	}

	public AccountRole getAccountRole() {
		return t;
	}

}