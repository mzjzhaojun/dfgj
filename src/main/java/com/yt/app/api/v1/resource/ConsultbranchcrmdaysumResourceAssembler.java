package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultbranchcrmdaysumController;
import com.yt.app.api.v1.entity.Consultbranchcrmdaysum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class ConsultbranchcrmdaysumResourceAssembler extends ResourceAssemblerSupport<Consultbranchcrmdaysum, ConsultbranchcrmdaysumResource> {
	public ConsultbranchcrmdaysumResourceAssembler() {
super(ConsultbranchcrmdaysumController.class, ConsultbranchcrmdaysumResource.class);
	}
	@Override	public ConsultbranchcrmdaysumResource toResource(Consultbranchcrmdaysum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultbranchcrmdaysumResource instantiateResource(Consultbranchcrmdaysum t) {
return new ConsultbranchcrmdaysumResource(t);
	}

}