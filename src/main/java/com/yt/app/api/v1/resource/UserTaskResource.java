package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.UserTaskController;
import com.yt.app.api.v1.entity.UserTask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class UserTaskResource extends ResourceSupport {
	private final UserTask t;
	public UserTaskResource(UserTask entity) {
		this.t = entity;
		this.add(linkTo(UserTaskController.class).withRel("post"));
		this.add(linkTo(methodOn(UserTaskController.class).list(null, null, null)).withRel("list"));
		
}
	public UserTask getUserTask() {
		return t;
	}


}