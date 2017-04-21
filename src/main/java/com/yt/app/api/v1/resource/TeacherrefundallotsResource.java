package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherrefundallotsController;
import com.yt.app.api.v1.entity.Teacherrefundallots;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:00
*/

public class TeacherrefundallotsResource extends ResourceSupport {
	private final Teacherrefundallots t;
	public TeacherrefundallotsResource(Teacherrefundallots entity) {
		this.t = entity;
		this.add(linkTo(TeacherrefundallotsController.class).withRel("post"));
		this.add(linkTo(methodOn(TeacherrefundallotsController.class).list(null, null, null)).withRel("list"));
		
}
	public Teacherrefundallots getTeacherrefundallots() {
		return t;
	}


}