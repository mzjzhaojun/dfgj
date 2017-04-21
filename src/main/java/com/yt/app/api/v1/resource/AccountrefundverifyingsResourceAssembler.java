package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountrefundverifyingsController;
import com.yt.app.api.v1.entity.Accountrefundverifyings;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:17
*/

public class AccountrefundverifyingsResourceAssembler extends ResourceAssemblerSupport<Accountrefundverifyings, AccountrefundverifyingsResource> {
	public AccountrefundverifyingsResourceAssembler() {
		super(AccountrefundverifyingsController.class, AccountrefundverifyingsResource.class);
	}
	@Override	public AccountrefundverifyingsResource toResource(Accountrefundverifyings t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountrefundverifyingsResource instantiateResource(Accountrefundverifyings t) {
		return new AccountrefundverifyingsResource(t);
	}

}