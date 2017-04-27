package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerteacherchargesController;
import com.yt.app.api.v1.entity.Customerteachercharges;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerteacherchargesResourceAssembler extends ResourceAssemblerSupport<Customerteachercharges, CustomerteacherchargesResource> {
	public CustomerteacherchargesResourceAssembler() {
super(CustomerteacherchargesController.class, CustomerteacherchargesResource.class);
	}
	@Override	public CustomerteacherchargesResource toResource(Customerteachercharges t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerteacherchargesResource instantiateResource(Customerteachercharges t) {
return new CustomerteacherchargesResource(t);
	}

}