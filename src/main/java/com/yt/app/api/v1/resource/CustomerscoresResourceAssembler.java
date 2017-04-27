package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerscoresController;
import com.yt.app.api.v1.entity.Customerscores;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerscoresResourceAssembler extends ResourceAssemblerSupport<Customerscores, CustomerscoresResource> {
	public CustomerscoresResourceAssembler() {
super(CustomerscoresController.class, CustomerscoresResource.class);
	}
	@Override	public CustomerscoresResource toResource(Customerscores t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerscoresResource instantiateResource(Customerscores t) {
return new CustomerscoresResource(t);
	}

}