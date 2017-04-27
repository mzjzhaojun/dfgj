package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ProductclassstatsController;
import com.yt.app.api.v1.entity.Productclassstats;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class ProductclassstatsResource extends ResourceSupport {
	private final Productclassstats t;
	public ProductclassstatsResource(Productclassstats entity) {
this.t = entity;
this.add(linkTo(ProductclassstatsController.class).withRel("post"));
this.add(linkTo(methodOn(ProductclassstatsController.class).list(null, null, null)).withRel("list"));

}
	public Productclassstats getProductclassstats() {
return t;
	}


}