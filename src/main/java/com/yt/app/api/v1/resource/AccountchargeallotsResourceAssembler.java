package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountchargeallotsController;
import com.yt.app.api.v1.entity.Accountchargeallots;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:43:59
*/

public class AccountchargeallotsResourceAssembler extends ResourceAssemblerSupport<Accountchargeallots, AccountchargeallotsResource> {
	public AccountchargeallotsResourceAssembler() {
		super(AccountchargeallotsController.class, AccountchargeallotsResource.class);
	}
	@Override	public AccountchargeallotsResource toResource(Accountchargeallots t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountchargeallotsResource instantiateResource(Accountchargeallots t) {
		return new AccountchargeallotsResource(t);
	}

}