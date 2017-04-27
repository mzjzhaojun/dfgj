package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccounttransferappliesController;
import com.yt.app.api.v1.entity.Accounttransferapplies;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class AccounttransferappliesResourceAssembler extends ResourceAssemblerSupport<Accounttransferapplies, AccounttransferappliesResource> {
	public AccounttransferappliesResourceAssembler() {
super(AccounttransferappliesController.class, AccounttransferappliesResource.class);
	}
	@Override	public AccounttransferappliesResource toResource(Accounttransferapplies t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AccounttransferappliesResource instantiateResource(Accounttransferapplies t) {
return new AccounttransferappliesResource(t);
	}

}