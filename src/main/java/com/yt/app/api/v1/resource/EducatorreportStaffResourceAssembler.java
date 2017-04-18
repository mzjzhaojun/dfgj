package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatorreportStaffController;
import com.yt.app.api.v1.entity.EducatorreportStaff;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatorreportStaffResourceAssembler extends ResourceAssemblerSupport<EducatorreportStaff, EducatorreportStaffResource> {
	public EducatorreportStaffResourceAssembler() {
		super(EducatorreportStaffController.class, EducatorreportStaffResource.class);
	}
	@Override	public EducatorreportStaffResource toResource(EducatorreportStaff t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatorreportStaffResource instantiateResource(EducatorreportStaff t) {
		return new EducatorreportStaffResource(t);
	}

}