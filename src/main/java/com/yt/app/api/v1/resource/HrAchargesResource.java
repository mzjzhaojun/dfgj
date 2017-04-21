package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.HrAchargesController;
import com.yt.app.api.v1.entity.HrAcharges;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:46
*/

public class HrAchargesResource extends ResourceSupport {
	private final HrAcharges t;
	public HrAchargesResource(HrAcharges entity) {
		this.t = entity;
		this.add(linkTo(HrAchargesController.class).withRel("post"));
		this.add(linkTo(methodOn(HrAchargesController.class).list(null, null, null)).withRel("list"));
		
}
	public HrAcharges getHrAcharges() {
		return t;
	}


}