package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.DebookorderitemsController;
import com.yt.app.api.v1.entity.Debookorderitems;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class DebookorderitemsResourceAssembler extends ResourceAssemblerSupport<Debookorderitems, DebookorderitemsResource> {
	public DebookorderitemsResourceAssembler() {
		super(DebookorderitemsController.class, DebookorderitemsResource.class);
	}
	@Override	public DebookorderitemsResource toResource(Debookorderitems t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected DebookorderitemsResource instantiateResource(Debookorderitems t) {
		return new DebookorderitemsResource(t);
	}

}