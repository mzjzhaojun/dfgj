package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CustomerteacherassignappliesController;
import com.yt.app.api.v1.entity.Customerteacherassignapplies;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomerteacherassignappliesResourceAssembler extends ResourceAssemblerSupport<Customerteacherassignapplies, CustomerteacherassignappliesResource> {
	public CustomerteacherassignappliesResourceAssembler() {
		super(CustomerteacherassignappliesController.class, CustomerteacherassignappliesResource.class);
	}
	@Override	public CustomerteacherassignappliesResource toResource(Customerteacherassignapplies t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CustomerteacherassignappliesResource instantiateResource(Customerteacherassignapplies t) {
		return new CustomerteacherassignappliesResource(t);
	}

}