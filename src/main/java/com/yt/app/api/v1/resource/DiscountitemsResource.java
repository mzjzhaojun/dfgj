package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.DiscountitemsController;
import com.yt.app.api.v1.entity.Discountitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class DiscountitemsResource extends ResourceSupport {
	private final Discountitems t;
	public DiscountitemsResource(Discountitems entity) {
		this.t = entity;
		this.add(linkTo(DiscountitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(DiscountitemsController.class).list(null, null, null)).withRel("list"));
		
}
	public Discountitems getDiscountitems() {
		return t;
	}


}