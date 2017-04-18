package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomeraccountmonthlystatController;
import com.yt.app.api.v1.entity.Customeraccountmonthlystat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CustomeraccountmonthlystatResource extends ResourceSupport {
	private final Customeraccountmonthlystat t;
	public CustomeraccountmonthlystatResource(Customeraccountmonthlystat entity) {
		this.t = entity;
		this.add(linkTo(CustomeraccountmonthlystatController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomeraccountmonthlystatController.class).list(null, null, null)).withRel("list"));
		
}
	public Customeraccountmonthlystat getCustomeraccountmonthlystat() {
		return t;
	}


}