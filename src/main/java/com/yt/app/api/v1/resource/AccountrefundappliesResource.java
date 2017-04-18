package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountrefundappliesController;
import com.yt.app.api.v1.entity.Accountrefundapplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AccountrefundappliesResource extends ResourceSupport {
	private final Accountrefundapplies t;
	public AccountrefundappliesResource(Accountrefundapplies entity) {
		this.t = entity;
		this.add(linkTo(AccountrefundappliesController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountrefundappliesController.class).list(null, null, null)).withRel("list"));
		
}
	public Accountrefundapplies getAccountrefundapplies() {
		return t;
	}


}