package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.FinancialassignmonthlyincomeController;
import com.yt.app.api.v1.entity.Financialassignmonthlyincome;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class FinancialassignmonthlyincomeResourceAssembler extends ResourceAssemblerSupport<Financialassignmonthlyincome, FinancialassignmonthlyincomeResource> {
	public FinancialassignmonthlyincomeResourceAssembler() {
		super(FinancialassignmonthlyincomeController.class, FinancialassignmonthlyincomeResource.class);
	}
	@Override	public FinancialassignmonthlyincomeResource toResource(Financialassignmonthlyincome t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected FinancialassignmonthlyincomeResource instantiateResource(Financialassignmonthlyincome t) {
		return new FinancialassignmonthlyincomeResource(t);
	}

}