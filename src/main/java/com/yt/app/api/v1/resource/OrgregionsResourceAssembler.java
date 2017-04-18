package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrgregionsController;
import com.yt.app.api.v1.entity.Orgregions;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class OrgregionsResourceAssembler extends ResourceAssemblerSupport<Orgregions, OrgregionsResource> {
	public OrgregionsResourceAssembler() {
		super(OrgregionsController.class, OrgregionsResource.class);
	}
	@Override	public OrgregionsResource toResource(Orgregions t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OrgregionsResource instantiateResource(Orgregions t) {
		return new OrgregionsResource(t);
	}

}