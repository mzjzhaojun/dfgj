package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrgstaffjobsController;
import com.yt.app.api.v1.entity.Orgstaffjobs;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class OrgstaffjobsResourceAssembler extends ResourceAssemblerSupport<Orgstaffjobs, OrgstaffjobsResource> {
	public OrgstaffjobsResourceAssembler() {
		super(OrgstaffjobsController.class, OrgstaffjobsResource.class);
	}
	@Override	public OrgstaffjobsResource toResource(Orgstaffjobs t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OrgstaffjobsResource instantiateResource(Orgstaffjobs t) {
		return new OrgstaffjobsResource(t);
	}

}