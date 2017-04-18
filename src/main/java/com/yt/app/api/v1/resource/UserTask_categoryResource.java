package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.UserTask_categoryController;
import com.yt.app.api.v1.entity.UserTask_category;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class UserTask_categoryResource extends ResourceSupport {
	private final UserTask_category t;
	public UserTask_categoryResource(UserTask_category entity) {
		this.t = entity;
		this.add(linkTo(UserTask_categoryController.class).withRel("post"));
		this.add(linkTo(methodOn(UserTask_categoryController.class).list(null, null, null)).withRel("list"));
		
}
	public UserTask_category getUserTask_category() {
		return t;
	}


}