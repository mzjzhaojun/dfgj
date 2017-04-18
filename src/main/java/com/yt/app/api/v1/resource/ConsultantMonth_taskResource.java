package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultantMonth_taskController;
import com.yt.app.api.v1.entity.ConsultantMonth_task;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class ConsultantMonth_taskResource extends ResourceSupport {
	private final ConsultantMonth_task t;
	public ConsultantMonth_taskResource(ConsultantMonth_task entity) {
		this.t = entity;
		this.add(linkTo(ConsultantMonth_taskController.class).withRel("post"));
		this.add(linkTo(methodOn(ConsultantMonth_taskController.class).list(null, null, null)).withRel("list"));
		
}
	public ConsultantMonth_task getConsultantMonth_task() {
		return t;
	}


}