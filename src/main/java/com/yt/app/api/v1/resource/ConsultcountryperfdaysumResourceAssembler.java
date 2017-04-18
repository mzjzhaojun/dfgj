package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultcountryperfdaysumController;
import com.yt.app.api.v1.entity.Consultcountryperfdaysum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class ConsultcountryperfdaysumResourceAssembler extends ResourceAssemblerSupport<Consultcountryperfdaysum, ConsultcountryperfdaysumResource> {
	public ConsultcountryperfdaysumResourceAssembler() {
		super(ConsultcountryperfdaysumController.class, ConsultcountryperfdaysumResource.class);
	}
	@Override	public ConsultcountryperfdaysumResource toResource(Consultcountryperfdaysum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultcountryperfdaysumResource instantiateResource(Consultcountryperfdaysum t) {
		return new ConsultcountryperfdaysumResource(t);
	}

}