package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.DiscountsController;
import com.yt.app.api.v1.entity.Discounts;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class DiscountsResource extends ResourceSupport {
	private final Discounts t;
	public DiscountsResource(Discounts entity) {
		this.t = entity;
		this.add(linkTo(DiscountsController.class).withRel("post"));
		this.add(linkTo(methodOn(DiscountsController.class).list(null, null, null)).withRel("list"));
		
}
	public Discounts getDiscounts() {
		return t;
	}


}