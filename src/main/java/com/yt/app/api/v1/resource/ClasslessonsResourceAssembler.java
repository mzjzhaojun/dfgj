package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ClasslessonsController;
import com.yt.app.api.v1.entity.Classlessons;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:24
*/

public class ClasslessonsResourceAssembler extends ResourceAssemblerSupport<Classlessons, ClasslessonsResource> {
	public ClasslessonsResourceAssembler() {
		super(ClasslessonsController.class, ClasslessonsResource.class);
	}
	@Override	public ClasslessonsResource toResource(Classlessons t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ClasslessonsResource instantiateResource(Classlessons t) {
		return new ClasslessonsResource(t);
	}

}