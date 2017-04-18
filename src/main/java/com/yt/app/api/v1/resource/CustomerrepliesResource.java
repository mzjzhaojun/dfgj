package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerrepliesController;
import com.yt.app.api.v1.entity.Customerreplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomerrepliesResource extends ResourceSupport {
	private final Customerreplies t;
	public CustomerrepliesResource(Customerreplies entity) {
		this.t = entity;
		this.add(linkTo(CustomerrepliesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerrepliesController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerreplies getCustomerreplies() {
		return t;
	}


}