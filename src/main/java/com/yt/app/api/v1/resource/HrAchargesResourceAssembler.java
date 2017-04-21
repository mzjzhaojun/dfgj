package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.HrAchargesController;
import com.yt.app.api.v1.entity.HrAcharges;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:46
*/

public class HrAchargesResourceAssembler extends ResourceAssemblerSupport<HrAcharges, HrAchargesResource> {
	public HrAchargesResourceAssembler() {
		super(HrAchargesController.class, HrAchargesResource.class);
	}
	@Override	public HrAchargesResource toResource(HrAcharges t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected HrAchargesResource instantiateResource(HrAcharges t) {
		return new HrAchargesResource(t);
	}

}