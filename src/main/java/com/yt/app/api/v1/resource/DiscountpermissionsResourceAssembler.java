package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.DiscountpermissionsController;
import com.yt.app.api.v1.entity.Discountpermissions;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class DiscountpermissionsResourceAssembler extends ResourceAssemblerSupport<Discountpermissions, DiscountpermissionsResource> {
	public DiscountpermissionsResourceAssembler() {
		super(DiscountpermissionsController.class, DiscountpermissionsResource.class);
	}
	@Override	public DiscountpermissionsResource toResource(Discountpermissions t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected DiscountpermissionsResource instantiateResource(Discountpermissions t) {
		return new DiscountpermissionsResource(t);
	}

}