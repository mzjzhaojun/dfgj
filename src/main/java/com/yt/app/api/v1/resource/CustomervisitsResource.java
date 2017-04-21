package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomervisitsController;
import com.yt.app.api.v1.entity.Customervisits;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:38
*/

public class CustomervisitsResource extends ResourceSupport {
	private final Customervisits t;
	public CustomervisitsResource(Customervisits entity) {
		this.t = entity;
		this.add(linkTo(CustomervisitsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomervisitsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customervisits getCustomervisits() {
		return t;
	}


}