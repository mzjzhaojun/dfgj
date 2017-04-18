package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CategoriesController;
import com.yt.app.api.v1.entity.Categories;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CategoriesResourceAssembler extends ResourceAssemblerSupport<Categories, CategoriesResource> {
	public CategoriesResourceAssembler() {
		super(CategoriesController.class, CategoriesResource.class);
	}
	@Override	public CategoriesResource toResource(Categories t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CategoriesResource instantiateResource(Categories t) {
		return new CategoriesResource(t);
	}

}