package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountchargeappliesController;
import com.yt.app.api.v1.entity.Accountchargeapplies;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:45
*/

public class AccountchargeappliesResourceAssembler extends ResourceAssemblerSupport<Accountchargeapplies, AccountchargeappliesResource> {
	public AccountchargeappliesResourceAssembler() {
super(AccountchargeappliesController.class, AccountchargeappliesResource.class);
	}
	@Override	public AccountchargeappliesResource toResource(Accountchargeapplies t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountchargeappliesResource instantiateResource(Accountchargeapplies t) {
return new AccountchargeappliesResource(t);
	}

}