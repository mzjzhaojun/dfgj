package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.DebookordersController;
import com.yt.app.api.v1.entity.Debookorders;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class DebookordersResourceAssembler extends ResourceAssemblerSupport<Debookorders, DebookordersResource> {
	public DebookordersResourceAssembler() {
		super(DebookordersController.class, DebookordersResource.class);
	}
	@Override	public DebookordersResource toResource(Debookorders t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected DebookordersResource instantiateResource(Debookorders t) {
		return new DebookordersResource(t);
	}

}