package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrderitemsController;
import com.yt.app.api.v1.entity.Orderitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class OrderitemsResource extends ResourceSupport {
	private final Orderitems t;
	public OrderitemsResource(Orderitems entity) {
		this.t = entity;
		this.add(linkTo(OrderitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(OrderitemsController.class).list(null, null, null)).withRel("list"));
		
}
	public Orderitems getOrderitems() {
		return t;
	}


}