package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampustaxrateconfigController;
import com.yt.app.api.v1.entity.Campustaxrateconfig;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:23
*/

public class CampustaxrateconfigResourceAssembler extends ResourceAssemblerSupport<Campustaxrateconfig, CampustaxrateconfigResource> {
	public CampustaxrateconfigResourceAssembler() {
		super(CampustaxrateconfigController.class, CampustaxrateconfigResource.class);
	}
	@Override	public CampustaxrateconfigResource toResource(Campustaxrateconfig t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampustaxrateconfigResource instantiateResource(Campustaxrateconfig t) {
		return new CampustaxrateconfigResource(t);
	}

}