package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ClassesController;
import com.yt.app.api.v1.entity.Classes;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class ClassesResourceAssembler extends ResourceAssemblerSupport<Classes, ClassesResource> {
	public ClassesResourceAssembler() {
		super(ClassesController.class, ClassesResource.class);
	}
	@Override	public ClassesResource toResource(Classes t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ClassesResource instantiateResource(Classes t) {
		return new ClassesResource(t);
	}

}