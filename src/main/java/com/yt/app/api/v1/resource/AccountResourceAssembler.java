package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountController;
import com.yt.app.api.v1.entity.Account;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-14 10:16:02
*/

public class AccountResourceAssembler extends ResourceAssemblerSupport<Account, AccountResource> {
	public AccountResourceAssembler() {
		super(AccountController.class, AccountResource.class);
	}
	@Override	public AccountResource toResource(Account t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountResource instantiateResource(Account t) {
		return new AccountResource(t);
	}

}