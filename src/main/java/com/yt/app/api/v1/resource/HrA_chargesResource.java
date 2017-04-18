package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.HrA_chargesController;
import com.yt.app.api.v1.entity.HrA_charges;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrA_chargesResource extends ResourceSupport {
	private final HrA_charges t;
	public HrA_chargesResource(HrA_charges entity) {
		this.t = entity;
		this.add(linkTo(HrA_chargesController.class).withRel("post"));
		this.add(linkTo(methodOn(HrA_chargesController.class).list(null, null, null)).withRel("list"));
		
}
	public HrA_charges getHrA_charges() {
		return t;
	}


}