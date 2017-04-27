package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.IncomereportController;
import com.yt.app.api.v1.entity.Incomereport;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class IncomereportResourceAssembler extends ResourceAssemblerSupport<Incomereport, IncomereportResource> {
	public IncomereportResourceAssembler() {
super(IncomereportController.class, IncomereportResource.class);
	}
	@Override	public IncomereportResource toResource(Incomereport t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected IncomereportResource instantiateResource(Incomereport t) {
return new IncomereportResource(t);
	}

}