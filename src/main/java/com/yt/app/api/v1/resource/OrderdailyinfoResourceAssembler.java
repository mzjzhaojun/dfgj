package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrderdailyinfoController;
import com.yt.app.api.v1.entity.Orderdailyinfo;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class OrderdailyinfoResourceAssembler extends ResourceAssemblerSupport<Orderdailyinfo, OrderdailyinfoResource> {
	public OrderdailyinfoResourceAssembler() {
		super(OrderdailyinfoController.class, OrderdailyinfoResource.class);
	}
	@Override	public OrderdailyinfoResource toResource(Orderdailyinfo t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OrderdailyinfoResource instantiateResource(Orderdailyinfo t) {
		return new OrderdailyinfoResource(t);
	}

}