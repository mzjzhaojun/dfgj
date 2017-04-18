package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachersearchController;
import com.yt.app.api.v1.entity.Teachersearch;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class TeachersearchResource extends ResourceSupport {
	private final Teachersearch t;
	public TeachersearchResource(Teachersearch entity) {
		this.t = entity;
		this.add(linkTo(TeachersearchController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachersearchController.class).list(null, null, null)).withRel("list"));
		
}
	public Teachersearch getTeachersearch() {
		return t;
	}


}