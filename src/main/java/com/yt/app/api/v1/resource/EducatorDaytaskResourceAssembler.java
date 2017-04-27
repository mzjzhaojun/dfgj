package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatorDaytaskController;
import com.yt.app.api.v1.entity.EducatorDaytask;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class EducatorDaytaskResourceAssembler extends ResourceAssemblerSupport<EducatorDaytask, EducatorDaytaskResource> {
	public EducatorDaytaskResourceAssembler() {
super(EducatorDaytaskController.class, EducatorDaytaskResource.class);
	}
	@Override	public EducatorDaytaskResource toResource(EducatorDaytask t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatorDaytaskResource instantiateResource(EducatorDaytask t) {
return new EducatorDaytaskResource(t);
	}

}