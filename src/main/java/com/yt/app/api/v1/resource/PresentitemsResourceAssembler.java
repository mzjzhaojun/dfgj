package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PresentitemsController;
import com.yt.app.api.v1.entity.Presentitems;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:53
*/

public class PresentitemsResourceAssembler extends ResourceAssemblerSupport<Presentitems, PresentitemsResource> {
	public PresentitemsResourceAssembler() {
		super(PresentitemsController.class, PresentitemsResource.class);
	}
	@Override	public PresentitemsResource toResource(Presentitems t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected PresentitemsResource instantiateResource(Presentitems t) {
		return new PresentitemsResource(t);
	}

}