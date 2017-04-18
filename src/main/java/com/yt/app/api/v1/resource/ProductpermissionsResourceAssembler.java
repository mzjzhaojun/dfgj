package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ProductpermissionsController;
import com.yt.app.api.v1.entity.Productpermissions;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class ProductpermissionsResourceAssembler extends ResourceAssemblerSupport<Productpermissions, ProductpermissionsResource> {
	public ProductpermissionsResourceAssembler() {
		super(ProductpermissionsController.class, ProductpermissionsResource.class);
	}
	@Override	public ProductpermissionsResource toResource(Productpermissions t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ProductpermissionsResource instantiateResource(Productpermissions t) {
		return new ProductpermissionsResource(t);
	}

}