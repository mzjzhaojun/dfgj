package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ClasslessonitemsController;
import com.yt.app.api.v1.entity.Classlessonitems;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class ClasslessonitemsResourceAssembler extends ResourceAssemblerSupport<Classlessonitems, ClasslessonitemsResource> {
	public ClasslessonitemsResourceAssembler() {
super(ClasslessonitemsController.class, ClasslessonitemsResource.class);
	}
	@Override	public ClasslessonitemsResource toResource(Classlessonitems t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ClasslessonitemsResource instantiateResource(Classlessonitems t) {
return new ClasslessonitemsResource(t);
	}

}