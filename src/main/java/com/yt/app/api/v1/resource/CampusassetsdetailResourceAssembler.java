package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusassetsdetailController;
import com.yt.app.api.v1.entity.Campusassetsdetail;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampusassetsdetailResourceAssembler extends ResourceAssemblerSupport<Campusassetsdetail, CampusassetsdetailResource> {
	public CampusassetsdetailResourceAssembler() {
		super(CampusassetsdetailController.class, CampusassetsdetailResource.class);
	}
	@Override	public CampusassetsdetailResource toResource(Campusassetsdetail t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampusassetsdetailResource instantiateResource(Campusassetsdetail t) {
		return new CampusassetsdetailResource(t);
	}

}