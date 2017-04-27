package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.StaffchargestatController;
import com.yt.app.api.v1.entity.Staffchargestat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class StaffchargestatResourceAssembler extends ResourceAssemblerSupport<Staffchargestat, StaffchargestatResource> {
	public StaffchargestatResourceAssembler() {
super(StaffchargestatController.class, StaffchargestatResource.class);
	}
	@Override	public StaffchargestatResource toResource(Staffchargestat t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected StaffchargestatResource instantiateResource(Staffchargestat t) {
return new StaffchargestatResource(t);
	}

}