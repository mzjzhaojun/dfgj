package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountchargeallotsController;
import com.yt.app.api.v1.entity.Accountchargeallots;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:16
*/

public class AccountchargeallotsResource extends ResourceSupport {
	private final Accountchargeallots t;
	public AccountchargeallotsResource(Accountchargeallots entity) {
		this.t = entity;
		this.add(linkTo(AccountchargeallotsController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountchargeallotsController.class).list(null, null, null)).withRel("list"));
		
}
	public Accountchargeallots getAccountchargeallots() {
		return t;
	}


}