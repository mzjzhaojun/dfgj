package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountsController;
import com.yt.app.api.v1.entity.Accounts;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:18
*/

public class AccountsResource extends ResourceSupport {
	private final Accounts t;
	public AccountsResource(Accounts entity) {
		this.t = entity;
		this.add(linkTo(AccountsController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountsController.class).list(null, null, null)).withRel("list"));
		
}
	public Accounts getAccounts() {
		return t;
	}


}