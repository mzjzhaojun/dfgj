package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerverifiesController;
import com.yt.app.api.v1.entity.Customerverifies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:38
*/

public class CustomerverifiesResource extends ResourceSupport {
	private final Customerverifies t;
	public CustomerverifiesResource(Customerverifies entity) {
		this.t = entity;
		this.add(linkTo(CustomerverifiesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerverifiesController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerverifies getCustomerverifies() {
		return t;
	}


}