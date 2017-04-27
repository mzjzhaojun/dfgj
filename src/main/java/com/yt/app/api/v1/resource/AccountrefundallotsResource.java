package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountrefundallotsController;
import com.yt.app.api.v1.entity.Accountrefundallots;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class AccountrefundallotsResource extends ResourceSupport {
	private final Accountrefundallots t;
	public AccountrefundallotsResource(Accountrefundallots entity) {
this.t = entity;
this.add(linkTo(AccountrefundallotsController.class).withRel("post"));
this.add(linkTo(methodOn(AccountrefundallotsController.class).list(null, null, null)).withRel("list"));

}
	public Accountrefundallots getAccountrefundallots() {
return t;
	}


}