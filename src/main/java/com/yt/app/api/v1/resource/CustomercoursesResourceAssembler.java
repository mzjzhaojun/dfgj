package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomercoursesController;
import com.yt.app.api.v1.entity.Customercourses;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomercoursesResourceAssembler extends ResourceAssemblerSupport<Customercourses, CustomercoursesResource> {
	public CustomercoursesResourceAssembler() {
super(CustomercoursesController.class, CustomercoursesResource.class);
	}
	@Override	public CustomercoursesResource toResource(Customercourses t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomercoursesResource instantiateResource(Customercourses t) {
return new CustomercoursesResource(t);
	}

}