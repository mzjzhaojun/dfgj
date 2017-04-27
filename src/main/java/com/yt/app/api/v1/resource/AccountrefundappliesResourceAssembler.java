package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountrefundappliesController;
import com.yt.app.api.v1.entity.Accountrefundapplies;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class AccountrefundappliesResourceAssembler extends ResourceAssemblerSupport<Accountrefundapplies, AccountrefundappliesResource> {
	public AccountrefundappliesResourceAssembler() {
		super(AccountrefundappliesController.class, AccountrefundappliesResource.class);
	}

	@Override
	public AccountrefundappliesResource toResource(Accountrefundapplies t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected AccountrefundappliesResource instantiateResource(Accountrefundapplies t) {
		return new AccountrefundappliesResource(t);
	}

}