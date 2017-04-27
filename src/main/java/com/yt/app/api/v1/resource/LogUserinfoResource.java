package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.LogUserinfoController;
import com.yt.app.api.v1.entity.LogUserinfo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class LogUserinfoResource extends ResourceSupport {
	private final LogUserinfo t;
	public LogUserinfoResource(LogUserinfo entity) {
this.t = entity;
this.add(linkTo(LogUserinfoController.class).withRel("post"));
this.add(linkTo(methodOn(LogUserinfoController.class).list(null, null, null)).withRel("list"));

}
	public LogUserinfo getLogUserinfo() {
return t;
	}


}