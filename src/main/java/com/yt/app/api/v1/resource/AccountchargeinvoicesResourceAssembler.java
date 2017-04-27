package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountchargeinvoicesController;
import com.yt.app.api.v1.entity.Accountchargeinvoices;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

public class AccountchargeinvoicesResourceAssembler extends ResourceAssemblerSupport<Accountchargeinvoices, AccountchargeinvoicesResource> {
	public AccountchargeinvoicesResourceAssembler() {
		super(AccountchargeinvoicesController.class, AccountchargeinvoicesResource.class);
	}

	@Override
	public AccountchargeinvoicesResource toResource(Accountchargeinvoices t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected AccountchargeinvoicesResource instantiateResource(Accountchargeinvoices t) {
		return new AccountchargeinvoicesResource(t);
	}

}