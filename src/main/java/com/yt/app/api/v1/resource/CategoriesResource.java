package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CategoriesController;
import com.yt.app.api.v1.entity.Categories;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class CategoriesResource extends ResourceSupport {
	private final Categories t;
	public CategoriesResource(Categories entity) {
this.t = entity;
this.add(linkTo(CategoriesController.class).withRel("post"));
this.add(linkTo(methodOn(CategoriesController.class).list(null, null, null)).withRel("list"));

}
	public Categories getCategories() {
return t;
	}


}