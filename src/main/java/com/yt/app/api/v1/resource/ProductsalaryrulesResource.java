package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ProductsalaryrulesController;
import com.yt.app.api.v1.entity.Productsalaryrules;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class ProductsalaryrulesResource extends ResourceSupport {
	private final Productsalaryrules t;
	public ProductsalaryrulesResource(Productsalaryrules entity) {
this.t = entity;
this.add(linkTo(ProductsalaryrulesController.class).withRel("post"));
this.add(linkTo(methodOn(ProductsalaryrulesController.class).list(null, null, null)).withRel("list"));

}
	public Productsalaryrules getProductsalaryrules() {
return t;
	}


}