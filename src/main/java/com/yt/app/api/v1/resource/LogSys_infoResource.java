package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.LogSys_infoController;
import com.yt.app.api.v1.entity.LogSys_info;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class LogSys_infoResource extends ResourceSupport {
	private final LogSys_info t;
	public LogSys_infoResource(LogSys_info entity) {
		this.t = entity;
		this.add(linkTo(LogSys_infoController.class).withRel("post"));
		this.add(linkTo(methodOn(LogSys_infoController.class).list(null, null, null)).withRel("list"));
		
}
	public LogSys_info getLogSys_info() {
		return t;
	}


}