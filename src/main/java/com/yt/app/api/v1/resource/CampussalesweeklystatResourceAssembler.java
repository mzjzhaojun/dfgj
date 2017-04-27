package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampussalesweeklystatController;
import com.yt.app.api.v1.entity.Campussalesweeklystat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class CampussalesweeklystatResourceAssembler extends ResourceAssemblerSupport<Campussalesweeklystat, CampussalesweeklystatResource> {
	public CampussalesweeklystatResourceAssembler() {
super(CampussalesweeklystatController.class, CampussalesweeklystatResource.class);
	}
	@Override	public CampussalesweeklystatResource toResource(Campussalesweeklystat t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampussalesweeklystatResource instantiateResource(Campussalesweeklystat t) {
return new CampussalesweeklystatResource(t);
	}

}