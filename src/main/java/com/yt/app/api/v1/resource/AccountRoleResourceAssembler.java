package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountRoleController;
import com.yt.app.api.v1.entity.AccountRole;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-27 17:32:56
*/

public class AccountRoleResourceAssembler extends ResourceAssemblerSupport<AccountRole, AccountRoleResource> {
	public AccountRoleResourceAssembler() {
		super(AccountRoleController.class, AccountRoleResource.class);
	}
	@Override	public AccountRoleResource toResource(AccountRole t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccountRoleResource instantiateResource(AccountRole t) {
		return new AccountRoleResource(t);
	}

}