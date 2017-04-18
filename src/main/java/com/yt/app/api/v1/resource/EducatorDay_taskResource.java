package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatorDay_taskController;
import com.yt.app.api.v1.entity.EducatorDay_task;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatorDay_taskResource extends ResourceSupport {
	private final EducatorDay_task t;
	public EducatorDay_taskResource(EducatorDay_task entity) {
		this.t = entity;
		this.add(linkTo(EducatorDay_taskController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatorDay_taskController.class).list(null, null, null)).withRel("list"));
		
}
	public EducatorDay_task getEducatorDay_task() {
		return t;
	}


}