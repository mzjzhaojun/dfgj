package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerController;
import com.yt.app.api.v1.entity.Customer;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:28
*/

public class CustomerResource extends ResourceSupport {
	private final Customer t;
	public CustomerResource(Customer entity) {
		this.t = entity;
		this.add(linkTo(CustomerController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerController.class).list(null, null, null)).withRel("list"));
		
}
	public Customer getCustomer() {
		return t;
	}


}