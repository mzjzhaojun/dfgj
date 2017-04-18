package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.HrD_chargeallotsController;
import com.yt.app.api.v1.entity.HrD_chargeallots;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrD_chargeallotsResourceAssembler extends ResourceAssemblerSupport<HrD_chargeallots, HrD_chargeallotsResource> {
	public HrD_chargeallotsResourceAssembler() {
		super(HrD_chargeallotsController.class, HrD_chargeallotsResource.class);
	}
	@Override	public HrD_chargeallotsResource toResource(HrD_chargeallots t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected HrD_chargeallotsResource instantiateResource(HrD_chargeallots t) {
		return new HrD_chargeallotsResource(t);
	}

}