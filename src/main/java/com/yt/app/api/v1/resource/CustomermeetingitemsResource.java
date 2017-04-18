package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomermeetingitemsController;
import com.yt.app.api.v1.entity.Customermeetingitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomermeetingitemsResource extends ResourceSupport {
	private final Customermeetingitems t;
	public CustomermeetingitemsResource(Customermeetingitems entity) {
		this.t = entity;
		this.add(linkTo(CustomermeetingitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomermeetingitemsController.class).list(null, null, null)).withRel("list"));
		
}
	public Customermeetingitems getCustomermeetingitems() {
		return t;
	}


}