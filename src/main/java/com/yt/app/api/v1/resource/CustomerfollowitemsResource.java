package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerfollowitemsController;
import com.yt.app.api.v1.entity.Customerfollowitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:30
*/

public class CustomerfollowitemsResource extends ResourceSupport {
	private final Customerfollowitems t;
	public CustomerfollowitemsResource(Customerfollowitems entity) {
		this.t = entity;
		this.add(linkTo(CustomerfollowitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerfollowitemsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerfollowitems getCustomerfollowitems() {
		return t;
	}


}