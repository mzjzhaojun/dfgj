package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerserviceitemsController;
import com.yt.app.api.v1.entity.Customerserviceitems;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:34
*/

public class CustomerserviceitemsResourceAssembler extends ResourceAssemblerSupport<Customerserviceitems, CustomerserviceitemsResource> {
	public CustomerserviceitemsResourceAssembler() {
		super(CustomerserviceitemsController.class, CustomerserviceitemsResource.class);
	}
	@Override	public CustomerserviceitemsResource toResource(Customerserviceitems t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerserviceitemsResource instantiateResource(Customerserviceitems t) {
		return new CustomerserviceitemsResource(t);
	}

}