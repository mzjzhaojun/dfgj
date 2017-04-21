package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ExpensesController;
import com.yt.app.api.v1.entity.Expenses;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:45
*/

public class ExpensesResourceAssembler extends ResourceAssemblerSupport<Expenses, ExpensesResource> {
	public ExpensesResourceAssembler() {
		super(ExpensesController.class, ExpensesResource.class);
	}
	@Override	public ExpensesResource toResource(Expenses t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ExpensesResource instantiateResource(Expenses t) {
		return new ExpensesResource(t);
	}

}