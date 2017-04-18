package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatorWeek_taskController;
import com.yt.app.api.v1.entity.EducatorWeek_task;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatorWeek_taskResource extends ResourceSupport {
	private final EducatorWeek_task t;
	public EducatorWeek_taskResource(EducatorWeek_task entity) {
		this.t = entity;
		this.add(linkTo(EducatorWeek_taskController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatorWeek_taskController.class).list(null, null, null)).withRel("list"));
		
}
	public EducatorWeek_task getEducatorWeek_task() {
		return t;
	}


}