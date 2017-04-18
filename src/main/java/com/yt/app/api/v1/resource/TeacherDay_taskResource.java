package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherDay_taskController;
import com.yt.app.api.v1.entity.TeacherDay_task;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class TeacherDay_taskResource extends ResourceSupport {
	private final TeacherDay_task t;
	public TeacherDay_taskResource(TeacherDay_task entity) {
		this.t = entity;
		this.add(linkTo(TeacherDay_taskController.class).withRel("post"));
		this.add(linkTo(methodOn(TeacherDay_taskController.class).list(null, null, null)).withRel("list"));
		
}
	public TeacherDay_task getTeacherDay_task() {
		return t;
	}


}