package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.StaffresourcesController;
import com.yt.app.api.v1.entity.Staffresources;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:57
*/

public class StaffresourcesResourceAssembler extends ResourceAssemblerSupport<Staffresources, StaffresourcesResource> {
	public StaffresourcesResourceAssembler() {
		super(StaffresourcesController.class, StaffresourcesResource.class);
	}
	@Override	public StaffresourcesResource toResource(Staffresources t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected StaffresourcesResource instantiateResource(Staffresources t) {
		return new StaffresourcesResource(t);
	}

}