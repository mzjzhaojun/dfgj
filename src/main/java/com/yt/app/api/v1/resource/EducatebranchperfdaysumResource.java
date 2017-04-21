package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatebranchperfdaysumController;
import com.yt.app.api.v1.entity.Educatebranchperfdaysum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:40
*/

public class EducatebranchperfdaysumResource extends ResourceSupport {
	private final Educatebranchperfdaysum t;
	public EducatebranchperfdaysumResource(Educatebranchperfdaysum entity) {
		this.t = entity;
		this.add(linkTo(EducatebranchperfdaysumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatebranchperfdaysumController.class).list(null, null, null)).withRel("list"));
		
}
	public Educatebranchperfdaysum getEducatebranchperfdaysum() {
		return t;
	}


}