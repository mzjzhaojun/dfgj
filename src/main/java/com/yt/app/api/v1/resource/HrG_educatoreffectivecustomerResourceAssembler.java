package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.HrG_educatoreffectivecustomerController;
import com.yt.app.api.v1.entity.HrG_educatoreffectivecustomer;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrG_educatoreffectivecustomerResourceAssembler extends ResourceAssemblerSupport<HrG_educatoreffectivecustomer, HrG_educatoreffectivecustomerResource> {
	public HrG_educatoreffectivecustomerResourceAssembler() {
		super(HrG_educatoreffectivecustomerController.class, HrG_educatoreffectivecustomerResource.class);
	}
	@Override	public HrG_educatoreffectivecustomerResource toResource(HrG_educatoreffectivecustomer t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected HrG_educatoreffectivecustomerResource instantiateResource(HrG_educatoreffectivecustomer t) {
		return new HrG_educatoreffectivecustomerResource(t);
	}

}