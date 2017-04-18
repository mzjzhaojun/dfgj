package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountController;
import com.yt.app.api.v1.entity.Account;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-14 10:16:02
*/

public class AccountResource extends ResourceSupport {
	private final Account t;
	public AccountResource(Account entity) {
		this.t = entity;
		this.add(linkTo(AccountController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountController.class).list(null, null, null)).withRel("list"));
		
}
	public Account getAccount() {
		return t;
	}


}