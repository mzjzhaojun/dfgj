package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusrenewweeklystatController;
import com.yt.app.api.v1.entity.Campusrenewweeklystat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:22
*/

public class CampusrenewweeklystatResourceAssembler extends ResourceAssemblerSupport<Campusrenewweeklystat, CampusrenewweeklystatResource> {
	public CampusrenewweeklystatResourceAssembler() {
		super(CampusrenewweeklystatController.class, CampusrenewweeklystatResource.class);
	}
	@Override	public CampusrenewweeklystatResource toResource(Campusrenewweeklystat t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampusrenewweeklystatResource instantiateResource(Campusrenewweeklystat t) {
		return new CampusrenewweeklystatResource(t);
	}

}