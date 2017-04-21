package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherDaytaskController;
import com.yt.app.api.v1.entity.TeacherDaytask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:00
*/

public class TeacherDaytaskResource extends ResourceSupport {
	private final TeacherDaytask t;
	public TeacherDaytaskResource(TeacherDaytask entity) {
		this.t = entity;
		this.add(linkTo(TeacherDaytaskController.class).withRel("post"));
		this.add(linkTo(methodOn(TeacherDaytaskController.class).list(null, null, null)).withRel("list"));
		
}
	public TeacherDaytask getTeacherDaytask() {
		return t;
	}


}