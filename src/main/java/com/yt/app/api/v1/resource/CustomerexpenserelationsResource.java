package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerexpenserelationsController;
import com.yt.app.api.v1.entity.Customerexpenserelations;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:30
*/

public class CustomerexpenserelationsResource extends ResourceSupport {
	private final Customerexpenserelations t;
	public CustomerexpenserelationsResource(Customerexpenserelations entity) {
		this.t = entity;
		this.add(linkTo(CustomerexpenserelationsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerexpenserelationsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerexpenserelations getCustomerexpenserelations() {
		return t;
	}


}