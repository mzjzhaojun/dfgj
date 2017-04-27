package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountchargeappliesController;
import com.yt.app.api.v1.entity.Accountchargeapplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:45
*/

public class AccountchargeappliesResource extends ResourceSupport {
	private final Accountchargeapplies t;
	public AccountchargeappliesResource(Accountchargeapplies entity) {
this.t = entity;
this.add(linkTo(AccountchargeappliesController.class).withRel("post"));
this.add(linkTo(methodOn(AccountchargeappliesController.class).list(null, null, null)).withRel("list"));

}
	public Accountchargeapplies getAccountchargeapplies() {
return t;
	}


}