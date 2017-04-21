package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomertransferappliesController;
import com.yt.app.api.v1.entity.Customertransferapplies;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:37
*/

public class CustomertransferappliesResourceAssembler extends ResourceAssemblerSupport<Customertransferapplies, CustomertransferappliesResource> {
	public CustomertransferappliesResourceAssembler() {
		super(CustomertransferappliesController.class, CustomertransferappliesResource.class);
	}
	@Override	public CustomertransferappliesResource toResource(Customertransferapplies t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomertransferappliesResource instantiateResource(Customertransferapplies t) {
		return new CustomertransferappliesResource(t);
	}

}