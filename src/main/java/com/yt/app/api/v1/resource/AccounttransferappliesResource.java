package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccounttransferappliesController;
import com.yt.app.api.v1.entity.Accounttransferapplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class AccounttransferappliesResource extends ResourceSupport {
	private final Accounttransferapplies t;

	public AccounttransferappliesResource(Accounttransferapplies entity) {
		this.t = entity;
		this.add(linkTo(AccounttransferappliesController.class).withRel("post"));
		this.add(linkTo(methodOn(AccounttransferappliesController.class).list(null, null, null)).withRel("list"));

	}

	public Accounttransferapplies getAccounttransferapplies() {
		return t;
	}

}