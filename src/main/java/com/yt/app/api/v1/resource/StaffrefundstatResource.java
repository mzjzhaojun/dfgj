package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.StaffrefundstatController;
import com.yt.app.api.v1.entity.Staffrefundstat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class StaffrefundstatResource extends ResourceSupport {
	private final Staffrefundstat t;
	public StaffrefundstatResource(Staffrefundstat entity) {
		this.t = entity;
		this.add(linkTo(StaffrefundstatController.class).withRel("post"));
		this.add(linkTo(methodOn(StaffrefundstatController.class).list(null, null, null)).withRel("list"));
		
}
	public Staffrefundstat getStaffrefundstat() {
		return t;
	}


}