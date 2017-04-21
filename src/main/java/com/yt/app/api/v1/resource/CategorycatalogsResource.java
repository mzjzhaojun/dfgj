package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CategorycatalogsController;
import com.yt.app.api.v1.entity.Categorycatalogs;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:23
*/

public class CategorycatalogsResource extends ResourceSupport {
	private final Categorycatalogs t;
	public CategorycatalogsResource(Categorycatalogs entity) {
		this.t = entity;
		this.add(linkTo(CategorycatalogsController.class).withRel("post"));
		this.add(linkTo(methodOn(CategorycatalogsController.class).list(null, null, null)).withRel("list"));
		
}
	public Categorycatalogs getCategorycatalogs() {
		return t;
	}


}