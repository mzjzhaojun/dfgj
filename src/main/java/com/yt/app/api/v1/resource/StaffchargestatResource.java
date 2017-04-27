package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.StaffchargestatController;
import com.yt.app.api.v1.entity.Staffchargestat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class StaffchargestatResource extends ResourceSupport {
	private final Staffchargestat t;
	public StaffchargestatResource(Staffchargestat entity) {
this.t = entity;
this.add(linkTo(StaffchargestatController.class).withRel("post"));
this.add(linkTo(methodOn(StaffchargestatController.class).list(null, null, null)).withRel("list"));

}
	public Staffchargestat getStaffchargestat() {
return t;
	}


}