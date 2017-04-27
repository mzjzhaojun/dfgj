package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultbranchperfdaysumController;
import com.yt.app.api.v1.entity.Consultbranchperfdaysum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class ConsultbranchperfdaysumResourceAssembler extends ResourceAssemblerSupport<Consultbranchperfdaysum, ConsultbranchperfdaysumResource> {
	public ConsultbranchperfdaysumResourceAssembler() {
super(ConsultbranchperfdaysumController.class, ConsultbranchperfdaysumResource.class);
	}
	@Override	public ConsultbranchperfdaysumResource toResource(Consultbranchperfdaysum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultbranchperfdaysumResource instantiateResource(Consultbranchperfdaysum t) {
return new ConsultbranchperfdaysumResource(t);
	}

}