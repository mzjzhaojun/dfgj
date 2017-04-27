package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountrefundallotsController;
import com.yt.app.api.v1.entity.Accountrefundallots;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class AccountrefundallotsResourceAssembler extends ResourceAssemblerSupport<Accountrefundallots, AccountrefundallotsResource> {
	public AccountrefundallotsResourceAssembler() {
super(AccountrefundallotsController.class, AccountrefundallotsResource.class);
	}
	@Override	public AccountrefundallotsResource toResource(Accountrefundallots t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountrefundallotsResource instantiateResource(Accountrefundallots t) {
return new AccountrefundallotsResource(t);
	}

}