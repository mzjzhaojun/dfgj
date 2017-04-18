package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountchargepaymentsController;
import com.yt.app.api.v1.entity.Accountchargepayments;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AccountchargepaymentsResource extends ResourceSupport {
	private final Accountchargepayments t;
	public AccountchargepaymentsResource(Accountchargepayments entity) {
		this.t = entity;
		this.add(linkTo(AccountchargepaymentsController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountchargepaymentsController.class).list(null, null, null)).withRel("list"));
		
}
	public Accountchargepayments getAccountchargepayments() {
		return t;
	}


}