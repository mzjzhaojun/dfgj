package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CategorycatalogsController;
import com.yt.app.api.v1.entity.Categorycatalogs;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CategorycatalogsResourceAssembler extends ResourceAssemblerSupport<Categorycatalogs, CategorycatalogsResource> {
	public CategorycatalogsResourceAssembler() {
		super(CategorycatalogsController.class, CategorycatalogsResource.class);
	}
	@Override	public CategorycatalogsResource toResource(Categorycatalogs t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CategorycatalogsResource instantiateResource(Categorycatalogs t) {
		return new CategorycatalogsResource(t);
	}

}