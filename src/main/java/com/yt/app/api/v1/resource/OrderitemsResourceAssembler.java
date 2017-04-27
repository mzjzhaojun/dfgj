package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrderitemsController;
import com.yt.app.api.v1.entity.Orderitems;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class OrderitemsResourceAssembler extends ResourceAssemblerSupport<Orderitems, OrderitemsResource> {
	public OrderitemsResourceAssembler() {
super(OrderitemsController.class, OrderitemsResource.class);
	}
	@Override	public OrderitemsResource toResource(Orderitems t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OrderitemsResource instantiateResource(Orderitems t) {
return new OrderitemsResource(t);
	}

}