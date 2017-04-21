package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.SchoolsController;
import com.yt.app.api.v1.entity.Schools;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:56
*/

public class SchoolsResourceAssembler extends ResourceAssemblerSupport<Schools, SchoolsResource> {
	public SchoolsResourceAssembler() {
		super(SchoolsController.class, SchoolsResource.class);
	}
	@Override	public SchoolsResource toResource(Schools t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected SchoolsResource instantiateResource(Schools t) {
		return new SchoolsResource(t);
	}

}