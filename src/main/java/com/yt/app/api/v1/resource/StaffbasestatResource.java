package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.StaffbasestatController;
import com.yt.app.api.v1.entity.Staffbasestat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class StaffbasestatResource extends ResourceSupport {
	private final Staffbasestat t;
	public StaffbasestatResource(Staffbasestat entity) {
this.t = entity;
this.add(linkTo(StaffbasestatController.class).withRel("post"));
this.add(linkTo(methodOn(StaffbasestatController.class).list(null, null, null)).withRel("list"));

}
	public Staffbasestat getStaffbasestat() {
return t;
	}


}