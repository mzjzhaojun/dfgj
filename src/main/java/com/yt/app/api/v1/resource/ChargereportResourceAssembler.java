package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ChargereportController;
import com.yt.app.api.v1.entity.Chargereport;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class ChargereportResourceAssembler extends ResourceAssemblerSupport<Chargereport, ChargereportResource> {
	public ChargereportResourceAssembler() {
super(ChargereportController.class, ChargereportResource.class);
	}
	@Override	public ChargereportResource toResource(Chargereport t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ChargereportResource instantiateResource(Chargereport t) {
return new ChargereportResource(t);
	}

}