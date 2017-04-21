package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.LogSysinfoController;
import com.yt.app.api.v1.entity.LogSysinfo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:47
*/

public class LogSysinfoResource extends ResourceSupport {
	private final LogSysinfo t;
	public LogSysinfoResource(LogSysinfo entity) {
		this.t = entity;
		this.add(linkTo(LogSysinfoController.class).withRel("post"));
		this.add(linkTo(methodOn(LogSysinfoController.class).list(null, null, null)).withRel("list"));
		
}
	public LogSysinfo getLogSysinfo() {
		return t;
	}


}