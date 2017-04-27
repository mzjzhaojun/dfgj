package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerrefundsController;
import com.yt.app.api.v1.entity.Customerrefunds;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerrefundsResource extends ResourceSupport {
	private final Customerrefunds t;
	public CustomerrefundsResource(Customerrefunds entity) {
this.t = entity;
this.add(linkTo(CustomerrefundsController.class).withRel("post"));
this.add(linkTo(methodOn(CustomerrefundsController.class).list(null, null, null)).withRel("list"));

}
	public Customerrefunds getCustomerrefunds() {
return t;
	}


}