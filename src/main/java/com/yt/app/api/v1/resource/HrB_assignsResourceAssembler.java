package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.HrB_assignsController;
import com.yt.app.api.v1.entity.HrB_assigns;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrB_assignsResourceAssembler extends ResourceAssemblerSupport<HrB_assigns, HrB_assignsResource> {
	public HrB_assignsResourceAssembler() {
		super(HrB_assignsController.class, HrB_assignsResource.class);
	}
	@Override	public HrB_assignsResource toResource(HrB_assigns t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected HrB_assignsResource instantiateResource(HrB_assigns t) {
		return new HrB_assignsResource(t);
	}

}