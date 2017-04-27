package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerrefundalertsController;
import com.yt.app.api.v1.entity.Customerrefundalerts;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerrefundalertsResourceAssembler extends ResourceAssemblerSupport<Customerrefundalerts, CustomerrefundalertsResource> {
	public CustomerrefundalertsResourceAssembler() {
super(CustomerrefundalertsController.class, CustomerrefundalertsResource.class);
	}
	@Override	public CustomerrefundalertsResource toResource(Customerrefundalerts t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerrefundalertsResource instantiateResource(Customerrefundalerts t) {
return new CustomerrefundalertsResource(t);
	}

}