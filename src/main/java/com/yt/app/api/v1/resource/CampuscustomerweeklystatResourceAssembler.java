package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampuscustomerweeklystatController;
import com.yt.app.api.v1.entity.Campuscustomerweeklystat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampuscustomerweeklystatResourceAssembler extends ResourceAssemblerSupport<Campuscustomerweeklystat, CampuscustomerweeklystatResource> {
	public CampuscustomerweeklystatResourceAssembler() {
		super(CampuscustomerweeklystatController.class, CampuscustomerweeklystatResource.class);
	}
	@Override	public CampuscustomerweeklystatResource toResource(Campuscustomerweeklystat t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampuscustomerweeklystatResource instantiateResource(Campuscustomerweeklystat t) {
		return new CampuscustomerweeklystatResource(t);
	}

}