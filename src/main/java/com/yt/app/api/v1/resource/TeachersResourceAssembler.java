package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachersController;
import com.yt.app.api.v1.entity.Teachers;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/

public class TeachersResourceAssembler extends ResourceAssemblerSupport<Teachers, TeachersResource> {
	public TeachersResourceAssembler() {
super(TeachersController.class, TeachersResource.class);
	}
	@Override	public TeachersResource toResource(Teachers t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachersResource instantiateResource(Teachers t) {
return new TeachersResource(t);
	}

}