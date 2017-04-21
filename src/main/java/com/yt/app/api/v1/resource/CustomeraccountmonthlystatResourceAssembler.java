package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomeraccountmonthlystatController;
import com.yt.app.api.v1.entity.Customeraccountmonthlystat;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:28
*/

public class CustomeraccountmonthlystatResourceAssembler extends ResourceAssemblerSupport<Customeraccountmonthlystat, CustomeraccountmonthlystatResource> {
	public CustomeraccountmonthlystatResourceAssembler() {
		super(CustomeraccountmonthlystatController.class, CustomeraccountmonthlystatResource.class);
	}
	@Override	public CustomeraccountmonthlystatResource toResource(Customeraccountmonthlystat t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomeraccountmonthlystatResource instantiateResource(Customeraccountmonthlystat t) {
		return new CustomeraccountmonthlystatResource(t);
	}

}