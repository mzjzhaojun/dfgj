package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrdersController;
import com.yt.app.api.v1.entity.Orders;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:48
*/

public class OrdersResource extends ResourceSupport {
	private final Orders t;
	public OrdersResource(Orders entity) {
		this.t = entity;
		this.add(linkTo(OrdersController.class).withRel("post"));
		this.add(linkTo(methodOn(OrdersController.class).list(null, null, null)).withRel("list"));
		
}
	public Orders getOrders() {
		return t;
	}


}