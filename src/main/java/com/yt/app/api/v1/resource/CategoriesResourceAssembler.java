package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CategoriesController;
import com.yt.app.api.v1.entity.Categories;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CategoriesResourceAssembler extends ResourceAssemblerSupport<Categories, CategoriesResource> {
	public CategoriesResourceAssembler() {
		super(CategoriesController.class, CategoriesResource.class);
	}

	@Override
	public CategoriesResource toResource(Categories t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CategoriesResource instantiateResource(Categories t) {
		return new CategoriesResource(t);
	}

}