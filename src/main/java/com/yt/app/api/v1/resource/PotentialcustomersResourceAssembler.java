package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PotentialcustomersController;
import com.yt.app.api.v1.entity.Potentialcustomers;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class PotentialcustomersResourceAssembler extends ResourceAssemblerSupport<Potentialcustomers, PotentialcustomersResource> {
	public PotentialcustomersResourceAssembler() {
super(PotentialcustomersController.class, PotentialcustomersResource.class);
	}
	@Override	public PotentialcustomersResource toResource(Potentialcustomers t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected PotentialcustomersResource instantiateResource(Potentialcustomers t) {
return new PotentialcustomersResource(t);
	}

}