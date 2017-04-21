package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PosrecordsController;
import com.yt.app.api.v1.entity.Posrecords;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:52
*/

public class PosrecordsResourceAssembler extends ResourceAssemblerSupport<Posrecords, PosrecordsResource> {
	public PosrecordsResourceAssembler() {
		super(PosrecordsController.class, PosrecordsResource.class);
	}
	@Override	public PosrecordsResource toResource(Posrecords t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected PosrecordsResource instantiateResource(Posrecords t) {
		return new PosrecordsResource(t);
	}

}