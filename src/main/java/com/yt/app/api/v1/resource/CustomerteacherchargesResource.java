package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerteacherchargesController;
import com.yt.app.api.v1.entity.Customerteachercharges;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomerteacherchargesResource extends ResourceSupport {
	private final Customerteachercharges t;
	public CustomerteacherchargesResource(Customerteachercharges entity) {
		this.t = entity;
		this.add(linkTo(CustomerteacherchargesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerteacherchargesController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerteachercharges getCustomerteachercharges() {
		return t;
	}


}