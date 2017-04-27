package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountchargepaymentsController;
import com.yt.app.api.v1.entity.Accountchargepayments;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:45
*/

public class AccountchargepaymentsResourceAssembler extends ResourceAssemblerSupport<Accountchargepayments, AccountchargepaymentsResource> {
	public AccountchargepaymentsResourceAssembler() {
super(AccountchargepaymentsController.class, AccountchargepaymentsResource.class);
	}
	@Override	public AccountchargepaymentsResource toResource(Accountchargepayments t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountchargepaymentsResource instantiateResource(Accountchargepayments t) {
return new AccountchargepaymentsResource(t);
	}

}