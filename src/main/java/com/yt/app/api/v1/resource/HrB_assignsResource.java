package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.HrB_assignsController;
import com.yt.app.api.v1.entity.HrB_assigns;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrB_assignsResource extends ResourceSupport {
	private final HrB_assigns t;
	public HrB_assignsResource(HrB_assigns entity) {
		this.t = entity;
		this.add(linkTo(HrB_assignsController.class).withRel("post"));
		this.add(linkTo(methodOn(HrB_assignsController.class).list(null, null, null)).withRel("list"));
		
}
	public HrB_assigns getHrB_assigns() {
		return t;
	}


}