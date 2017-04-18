package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountchargeinvoicesController;
import com.yt.app.api.v1.entity.Accountchargeinvoices;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AccountchargeinvoicesResource extends ResourceSupport {
	private final Accountchargeinvoices t;
	public AccountchargeinvoicesResource(Accountchargeinvoices entity) {
		this.t = entity;
		this.add(linkTo(AccountchargeinvoicesController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountchargeinvoicesController.class).list(null, null, null)).withRel("list"));
		
}
	public Accountchargeinvoices getAccountchargeinvoices() {
		return t;
	}


}