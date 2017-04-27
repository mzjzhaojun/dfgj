package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountdeductappliesController;
import com.yt.app.api.v1.entity.Accountdeductapplies;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:45
*/

public class AccountdeductappliesResourceAssembler extends ResourceAssemblerSupport<Accountdeductapplies, AccountdeductappliesResource> {
	public AccountdeductappliesResourceAssembler() {
super(AccountdeductappliesController.class, AccountdeductappliesResource.class);
	}
	@Override	public AccountdeductappliesResource toResource(Accountdeductapplies t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountdeductappliesResource instantiateResource(Accountdeductapplies t) {
return new AccountdeductappliesResource(t);
	}

}