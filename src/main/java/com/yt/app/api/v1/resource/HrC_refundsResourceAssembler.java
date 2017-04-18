package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.HrC_refundsController;
import com.yt.app.api.v1.entity.HrC_refunds;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrC_refundsResourceAssembler extends ResourceAssemblerSupport<HrC_refunds, HrC_refundsResource> {
	public HrC_refundsResourceAssembler() {
		super(HrC_refundsController.class, HrC_refundsResource.class);
	}
	@Override	public HrC_refundsResource toResource(HrC_refunds t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected HrC_refundsResource instantiateResource(HrC_refunds t) {
		return new HrC_refundsResource(t);
	}

}