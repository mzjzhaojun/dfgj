package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatorWeektaskController;
import com.yt.app.api.v1.entity.EducatorWeektask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class EducatorWeektaskResource extends ResourceSupport {
	private final EducatorWeektask t;
	public EducatorWeektaskResource(EducatorWeektask entity) {
this.t = entity;
this.add(linkTo(EducatorWeektaskController.class).withRel("post"));
this.add(linkTo(methodOn(EducatorWeektaskController.class).list(null, null, null)).withRel("list"));

}
	public EducatorWeektask getEducatorWeektask() {
return t;
	}


}