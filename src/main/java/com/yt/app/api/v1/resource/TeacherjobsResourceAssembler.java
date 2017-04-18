package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherjobsController;
import com.yt.app.api.v1.entity.Teacherjobs;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class TeacherjobsResourceAssembler extends ResourceAssemblerSupport<Teacherjobs, TeacherjobsResource> {
	public TeacherjobsResourceAssembler() {
		super(TeacherjobsController.class, TeacherjobsResource.class);
	}
	@Override	public TeacherjobsResource toResource(Teacherjobs t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeacherjobsResource instantiateResource(Teacherjobs t) {
		return new TeacherjobsResource(t);
	}

}