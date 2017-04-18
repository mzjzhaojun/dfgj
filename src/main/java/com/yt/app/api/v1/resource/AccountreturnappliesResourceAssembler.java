package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountreturnappliesController;
import com.yt.app.api.v1.entity.Accountreturnapplies;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AccountreturnappliesResourceAssembler extends ResourceAssemblerSupport<Accountreturnapplies, AccountreturnappliesResource> {
	public AccountreturnappliesResourceAssembler() {
		super(AccountreturnappliesController.class, AccountreturnappliesResource.class);
	}
	@Override	public AccountreturnappliesResource toResource(Accountreturnapplies t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountreturnappliesResource instantiateResource(Accountreturnapplies t) {
		return new AccountreturnappliesResource(t);
	}

}