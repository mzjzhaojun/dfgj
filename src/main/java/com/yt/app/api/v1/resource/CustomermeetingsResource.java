package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomermeetingsController;
import com.yt.app.api.v1.entity.Customermeetings;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomermeetingsResource extends ResourceSupport {
	private final Customermeetings t;
	public CustomermeetingsResource(Customermeetings entity) {
		this.t = entity;
		this.add(linkTo(CustomermeetingsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomermeetingsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customermeetings getCustomermeetings() {
		return t;
	}


}