package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerserviceitemsController;
import com.yt.app.api.v1.entity.Customerserviceitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomerserviceitemsResource extends ResourceSupport {
	private final Customerserviceitems t;
	public CustomerserviceitemsResource(Customerserviceitems entity) {
		this.t = entity;
		this.add(linkTo(CustomerserviceitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerserviceitemsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerserviceitems getCustomerserviceitems() {
		return t;
	}


}