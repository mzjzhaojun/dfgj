package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrderdailyinfoController;
import com.yt.app.api.v1.entity.Orderdailyinfo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class OrderdailyinfoResource extends ResourceSupport {
	private final Orderdailyinfo t;
	public OrderdailyinfoResource(Orderdailyinfo entity) {
this.t = entity;
this.add(linkTo(OrderdailyinfoController.class).withRel("post"));
this.add(linkTo(methodOn(OrderdailyinfoController.class).list(null, null, null)).withRel("list"));

}
	public Orderdailyinfo getOrderdailyinfo() {
return t;
	}


}