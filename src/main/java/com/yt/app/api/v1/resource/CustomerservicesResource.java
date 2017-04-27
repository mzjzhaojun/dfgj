package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerservicesController;
import com.yt.app.api.v1.entity.Customerservices;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerservicesResource extends ResourceSupport {
	private final Customerservices t;
	public CustomerservicesResource(Customerservices entity) {
this.t = entity;
this.add(linkTo(CustomerservicesController.class).withRel("post"));
this.add(linkTo(methodOn(CustomerservicesController.class).list(null, null, null)).withRel("list"));

}
	public Customerservices getCustomerservices() {
return t;
	}


}