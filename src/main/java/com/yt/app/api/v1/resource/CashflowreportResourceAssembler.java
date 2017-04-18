package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CashflowreportController;
import com.yt.app.api.v1.entity.Cashflowreport;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CashflowreportResourceAssembler extends ResourceAssemblerSupport<Cashflowreport, CashflowreportResource> {
	public CashflowreportResourceAssembler() {
		super(CashflowreportController.class, CashflowreportResource.class);
	}
	@Override	public CashflowreportResource toResource(Cashflowreport t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CashflowreportResource instantiateResource(Cashflowreport t) {
		return new CashflowreportResource(t);
	}

}