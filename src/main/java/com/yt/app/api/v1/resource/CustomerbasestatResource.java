package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerbasestatController;
import com.yt.app.api.v1.entity.Customerbasestat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CustomerbasestatResource extends ResourceSupport {
	private final Customerbasestat t;
	public CustomerbasestatResource(Customerbasestat entity) {
		this.t = entity;
		this.add(linkTo(CustomerbasestatController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerbasestatController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerbasestat getCustomerbasestat() {
		return t;
	}


}