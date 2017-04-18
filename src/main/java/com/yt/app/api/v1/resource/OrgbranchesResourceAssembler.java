package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrgbranchesController;
import com.yt.app.api.v1.entity.Orgbranches;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class OrgbranchesResourceAssembler extends ResourceAssemblerSupport<Orgbranches, OrgbranchesResource> {
	public OrgbranchesResourceAssembler() {
		super(OrgbranchesController.class, OrgbranchesResource.class);
	}
	@Override	public OrgbranchesResource toResource(Orgbranches t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OrgbranchesResource instantiateResource(Orgbranches t) {
		return new OrgbranchesResource(t);
	}

}