package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ExpensepermissionsController;
import com.yt.app.api.v1.entity.Expensepermissions;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class ExpensepermissionsResourceAssembler extends ResourceAssemblerSupport<Expensepermissions, ExpensepermissionsResource> {
	public ExpensepermissionsResourceAssembler() {
		super(ExpensepermissionsController.class, ExpensepermissionsResource.class);
	}
	@Override	public ExpensepermissionsResource toResource(Expensepermissions t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ExpensepermissionsResource instantiateResource(Expensepermissions t) {
		return new ExpensepermissionsResource(t);
	}

}