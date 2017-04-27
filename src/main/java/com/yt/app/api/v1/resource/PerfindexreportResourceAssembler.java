package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PerfindexreportController;
import com.yt.app.api.v1.entity.Perfindexreport;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class PerfindexreportResourceAssembler extends ResourceAssemblerSupport<Perfindexreport, PerfindexreportResource> {
	public PerfindexreportResourceAssembler() {
super(PerfindexreportController.class, PerfindexreportResource.class);
	}
	@Override	public PerfindexreportResource toResource(Perfindexreport t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected PerfindexreportResource instantiateResource(Perfindexreport t) {
return new PerfindexreportResource(t);
	}

}