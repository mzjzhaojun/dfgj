package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.HrE_refundallotsController;
import com.yt.app.api.v1.entity.HrE_refundallots;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrE_refundallotsResourceAssembler extends ResourceAssemblerSupport<HrE_refundallots, HrE_refundallotsResource> {
	public HrE_refundallotsResourceAssembler() {
		super(HrE_refundallotsController.class, HrE_refundallotsResource.class);
	}
	@Override	public HrE_refundallotsResource toResource(HrE_refundallots t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected HrE_refundallotsResource instantiateResource(HrE_refundallots t) {
		return new HrE_refundallotsResource(t);
	}

}