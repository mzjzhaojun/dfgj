package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PhonesController;
import com.yt.app.api.v1.entity.Phones;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:52
*/

public class PhonesResourceAssembler extends ResourceAssemblerSupport<Phones, PhonesResource> {
	public PhonesResourceAssembler() {
		super(PhonesController.class, PhonesResource.class);
	}
	@Override	public PhonesResource toResource(Phones t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected PhonesResource instantiateResource(Phones t) {
		return new PhonesResource(t);
	}

}