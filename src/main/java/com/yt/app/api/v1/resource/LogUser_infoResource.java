package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.LogUser_infoController;
import com.yt.app.api.v1.entity.LogUser_info;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class LogUser_infoResource extends ResourceSupport {
	private final LogUser_info t;
	public LogUser_infoResource(LogUser_info entity) {
		this.t = entity;
		this.add(linkTo(LogUser_infoController.class).withRel("post"));
		this.add(linkTo(methodOn(LogUser_infoController.class).list(null, null, null)).withRel("list"));
		
}
	public LogUser_info getLogUser_info() {
		return t;
	}


}