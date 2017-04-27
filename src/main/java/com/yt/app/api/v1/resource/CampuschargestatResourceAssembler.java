package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampuschargestatController;
import com.yt.app.api.v1.entity.Campuschargestat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class CampuschargestatResourceAssembler extends ResourceAssemblerSupport<Campuschargestat, CampuschargestatResource> {
	public CampuschargestatResourceAssembler() {
super(CampuschargestatController.class, CampuschargestatResource.class);
	}
	@Override	public CampuschargestatResource toResource(Campuschargestat t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampuschargestatResource instantiateResource(Campuschargestat t) {
return new CampuschargestatResource(t);
	}

}