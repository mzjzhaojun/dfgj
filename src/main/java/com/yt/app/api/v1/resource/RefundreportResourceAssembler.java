package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.RefundreportController;
import com.yt.app.api.v1.entity.Refundreport;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class RefundreportResourceAssembler extends ResourceAssemblerSupport<Refundreport, RefundreportResource> {
	public RefundreportResourceAssembler() {
		super(RefundreportController.class, RefundreportResource.class);
	}
	@Override	public RefundreportResource toResource(Refundreport t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected RefundreportResource instantiateResource(Refundreport t) {
		return new RefundreportResource(t);
	}

}