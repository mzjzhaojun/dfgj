package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherjobsController;
import com.yt.app.api.v1.entity.Teacherjobs;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:00
*/

public class TeacherjobsResource extends ResourceSupport {
	private final Teacherjobs t;
	public TeacherjobsResource(Teacherjobs entity) {
		this.t = entity;
		this.add(linkTo(TeacherjobsController.class).withRel("post"));
		this.add(linkTo(methodOn(TeacherjobsController.class).list(null, null, null)).withRel("list"));
		
}
	public Teacherjobs getTeacherjobs() {
		return t;
	}


}