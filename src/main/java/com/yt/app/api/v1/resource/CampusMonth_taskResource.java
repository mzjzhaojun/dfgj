package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusMonth_taskController;
import com.yt.app.api.v1.entity.CampusMonth_task;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampusMonth_taskResource extends ResourceSupport {
	private final CampusMonth_task t;
	public CampusMonth_taskResource(CampusMonth_task entity) {
		this.t = entity;
		this.add(linkTo(CampusMonth_taskController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusMonth_taskController.class).list(null, null, null)).withRel("list"));
		
}
	public CampusMonth_task getCampusMonth_task() {
		return t;
	}


}