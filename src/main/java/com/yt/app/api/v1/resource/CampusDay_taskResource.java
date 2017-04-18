package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusDay_taskController;
import com.yt.app.api.v1.entity.CampusDay_task;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampusDay_taskResource extends ResourceSupport {
	private final CampusDay_task t;
	public CampusDay_taskResource(CampusDay_task entity) {
		this.t = entity;
		this.add(linkTo(CampusDay_taskController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusDay_taskController.class).list(null, null, null)).withRel("list"));
		
}
	public CampusDay_task getCampusDay_task() {
		return t;
	}


}