package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.HrA_chargesController;
import com.yt.app.api.v1.entity.HrA_charges;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrA_chargesResourceAssembler extends ResourceAssemblerSupport<HrA_charges, HrA_chargesResource> {
	public HrA_chargesResourceAssembler() {
		super(HrA_chargesController.class, HrA_chargesResource.class);
	}
	@Override	public HrA_chargesResource toResource(HrA_charges t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected HrA_chargesResource instantiateResource(HrA_charges t) {
		return new HrA_chargesResource(t);
	}

}