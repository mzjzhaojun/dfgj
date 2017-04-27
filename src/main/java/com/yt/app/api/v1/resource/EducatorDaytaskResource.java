package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatorDaytaskController;
import com.yt.app.api.v1.entity.EducatorDaytask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class EducatorDaytaskResource extends ResourceSupport {
	private final EducatorDaytask t;
	public EducatorDaytaskResource(EducatorDaytask entity) {
this.t = entity;
this.add(linkTo(EducatorDaytaskController.class).withRel("post"));
this.add(linkTo(methodOn(EducatorDaytaskController.class).list(null, null, null)).withRel("list"));

}
	public EducatorDaytask getEducatorDaytask() {
return t;
	}


}