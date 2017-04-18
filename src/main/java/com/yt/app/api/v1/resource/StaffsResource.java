package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.StaffsController;
import com.yt.app.api.v1.entity.Staffs;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class StaffsResource extends ResourceSupport {
	private final Staffs t;
	public StaffsResource(Staffs entity) {
		this.t = entity;
		this.add(linkTo(StaffsController.class).withRel("post"));
		this.add(linkTo(methodOn(StaffsController.class).list(null, null, null)).withRel("list"));
		
}
	public Staffs getStaffs() {
		return t;
	}


}