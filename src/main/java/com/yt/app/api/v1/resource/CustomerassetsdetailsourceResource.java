package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerassetsdetailsourceController;
import com.yt.app.api.v1.entity.Customerassetsdetailsource;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CustomerassetsdetailsourceResource extends ResourceSupport {
	private final Customerassetsdetailsource t;
	public CustomerassetsdetailsourceResource(Customerassetsdetailsource entity) {
		this.t = entity;
		this.add(linkTo(CustomerassetsdetailsourceController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerassetsdetailsourceController.class).list(null, null, null)).withRel("list"));
		
}
	public Customerassetsdetailsource getCustomerassetsdetailsource() {
		return t;
	}


}