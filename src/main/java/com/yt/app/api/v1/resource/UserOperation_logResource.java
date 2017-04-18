package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.UserOperation_logController;
import com.yt.app.api.v1.entity.UserOperation_log;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class UserOperation_logResource extends ResourceSupport {
	private final UserOperation_log t;
	public UserOperation_logResource(UserOperation_log entity) {
		this.t = entity;
		this.add(linkTo(UserOperation_logController.class).withRel("post"));
		this.add(linkTo(methodOn(UserOperation_logController.class).list(null, null, null)).withRel("list"));
		
}
	public UserOperation_log getUserOperation_log() {
		return t;
	}


}