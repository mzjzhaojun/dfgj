package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.SysController;
import com.yt.app.api.v1.entity.Sys;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-14 10:16:02
*/

public class SysResource extends ResourceSupport {
	private final Sys t;
	public SysResource(Sys entity) {
		this.t = entity;
		this.add(linkTo(SysController.class).withRel("post"));
		this.add(linkTo(methodOn(SysController.class).list(null, null, null)).withRel("list"));
		
}
	public Sys getSys() {
		return t;
	}


}