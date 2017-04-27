package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerparentrelationsController;
import com.yt.app.api.v1.entity.Customerparentrelations;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomerparentrelationsResource extends ResourceSupport {
	private final Customerparentrelations t;
	public CustomerparentrelationsResource(Customerparentrelations entity) {
this.t = entity;
this.add(linkTo(CustomerparentrelationsController.class).withRel("post"));
this.add(linkTo(methodOn(CustomerparentrelationsController.class).list(null, null, null)).withRel("list"));

}
	public Customerparentrelations getCustomerparentrelations() {
return t;
	}


}