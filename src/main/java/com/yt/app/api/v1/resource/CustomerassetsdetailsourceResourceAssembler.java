package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerassetsdetailsourceController;
import com.yt.app.api.v1.entity.Customerassetsdetailsource;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CustomerassetsdetailsourceResourceAssembler extends ResourceAssemblerSupport<Customerassetsdetailsource, CustomerassetsdetailsourceResource> {
	public CustomerassetsdetailsourceResourceAssembler() {
		super(CustomerassetsdetailsourceController.class, CustomerassetsdetailsourceResource.class);
	}
	@Override	public CustomerassetsdetailsourceResource toResource(Customerassetsdetailsource t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerassetsdetailsourceResource instantiateResource(Customerassetsdetailsource t) {
		return new CustomerassetsdetailsourceResource(t);
	}

}