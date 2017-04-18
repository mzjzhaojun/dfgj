package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusincomestatController;
import com.yt.app.api.v1.entity.Campusincomestat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampusincomestatResourceAssembler extends ResourceAssemblerSupport<Campusincomestat, CampusincomestatResource> {
	public CampusincomestatResourceAssembler() {
		super(CampusincomestatController.class, CampusincomestatResource.class);
	}
	@Override	public CampusincomestatResource toResource(Campusincomestat t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampusincomestatResource instantiateResource(Campusincomestat t) {
		return new CampusincomestatResource(t);
	}

}