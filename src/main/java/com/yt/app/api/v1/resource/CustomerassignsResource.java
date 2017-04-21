package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerassignsController;
import com.yt.app.api.v1.entity.Customerassigns;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:29
*/

public class CustomerassignsResource extends ResourceSupport {
	private final Customerassigns t;
	public CustomerassignsResource(Customerassigns entity) {
		this.t = entity;
		this.add(linkTo(CustomerassignsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerassignsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerassigns getCustomerassigns() {
		return t;
	}


}