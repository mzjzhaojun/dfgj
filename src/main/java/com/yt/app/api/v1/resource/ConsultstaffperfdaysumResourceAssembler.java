package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultstaffperfdaysumController;
import com.yt.app.api.v1.entity.Consultstaffperfdaysum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:27
*/

public class ConsultstaffperfdaysumResourceAssembler extends ResourceAssemblerSupport<Consultstaffperfdaysum, ConsultstaffperfdaysumResource> {
	public ConsultstaffperfdaysumResourceAssembler() {
		super(ConsultstaffperfdaysumController.class, ConsultstaffperfdaysumResource.class);
	}
	@Override	public ConsultstaffperfdaysumResource toResource(Consultstaffperfdaysum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultstaffperfdaysumResource instantiateResource(Consultstaffperfdaysum t) {
		return new ConsultstaffperfdaysumResource(t);
	}

}