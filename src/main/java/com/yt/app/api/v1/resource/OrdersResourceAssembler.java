package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrdersController;
import com.yt.app.api.v1.entity.Orders;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:48
*/

public class OrdersResourceAssembler extends ResourceAssemblerSupport<Orders, OrdersResource> {
	public OrdersResourceAssembler() {
		super(OrdersController.class, OrdersResource.class);
	}
	@Override	public OrdersResource toResource(Orders t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OrdersResource instantiateResource(Orders t) {
		return new OrdersResource(t);
	}

}