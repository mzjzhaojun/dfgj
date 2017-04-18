package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerfollowsController;
import com.yt.app.api.v1.entity.Customerfollows;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomerfollowsResource extends ResourceSupport {
	private final Customerfollows t;
	public CustomerfollowsResource(Customerfollows entity) {
		this.t = entity;
		this.add(linkTo(CustomerfollowsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerfollowsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerfollows getCustomerfollows() {
		return t;
	}


}