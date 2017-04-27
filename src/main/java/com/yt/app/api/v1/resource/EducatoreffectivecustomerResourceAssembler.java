package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatoreffectivecustomerController;
import com.yt.app.api.v1.entity.Educatoreffectivecustomer;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class EducatoreffectivecustomerResourceAssembler extends ResourceAssemblerSupport<Educatoreffectivecustomer, EducatoreffectivecustomerResource> {
	public EducatoreffectivecustomerResourceAssembler() {
super(EducatoreffectivecustomerController.class, EducatoreffectivecustomerResource.class);
	}
	@Override	public EducatoreffectivecustomerResource toResource(Educatoreffectivecustomer t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatoreffectivecustomerResource instantiateResource(Educatoreffectivecustomer t) {
return new EducatoreffectivecustomerResource(t);
	}

}