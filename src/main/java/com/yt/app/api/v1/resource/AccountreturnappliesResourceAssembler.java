package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountreturnappliesController;
import com.yt.app.api.v1.entity.Accountreturnapplies;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class AccountreturnappliesResourceAssembler extends ResourceAssemblerSupport<Accountreturnapplies, AccountreturnappliesResource> {
	public AccountreturnappliesResourceAssembler() {
		super(AccountreturnappliesController.class, AccountreturnappliesResource.class);
	}

	@Override
	public AccountreturnappliesResource toResource(Accountreturnapplies t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected AccountreturnappliesResource instantiateResource(Accountreturnapplies t) {
		return new AccountreturnappliesResource(t);
	}

}