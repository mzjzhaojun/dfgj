package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerrelationsController;
import com.yt.app.api.v1.entity.Customerrelations;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerrelationsResource extends ResourceSupport {
	private final Customerrelations t;
	public CustomerrelationsResource(Customerrelations entity) {
this.t = entity;
this.add(linkTo(CustomerrelationsController.class).withRel("post"));
this.add(linkTo(methodOn(CustomerrelationsController.class).list(null, null, null)).withRel("list"));

}
	public Customerrelations getCustomerrelations() {
return t;
	}


}