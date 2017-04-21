package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.StaffsController;
import com.yt.app.api.v1.entity.Staffs;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:57
*/

public class StaffsResourceAssembler extends ResourceAssemblerSupport<Staffs, StaffsResource> {
	public StaffsResourceAssembler() {
		super(StaffsController.class, StaffsResource.class);
	}
	@Override	public StaffsResource toResource(Staffs t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected StaffsResource instantiateResource(Staffs t) {
		return new StaffsResource(t);
	}

}