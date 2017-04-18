package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountsController;
import com.yt.app.api.v1.entity.Accounts;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AccountsResourceAssembler extends ResourceAssemblerSupport<Accounts, AccountsResource> {
	public AccountsResourceAssembler() {
		super(AccountsController.class, AccountsResource.class);
	}
	@Override	public AccountsResource toResource(Accounts t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountsResource instantiateResource(Accounts t) {
		return new AccountsResource(t);
	}

}