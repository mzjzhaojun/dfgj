package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomertransferaccountsController;
import com.yt.app.api.v1.entity.Customertransferaccounts;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/

public class CustomertransferaccountsResource extends ResourceSupport {
	private final Customertransferaccounts t;
	public CustomertransferaccountsResource(Customertransferaccounts entity) {
this.t = entity;
this.add(linkTo(CustomertransferaccountsController.class).withRel("post"));
this.add(linkTo(methodOn(CustomertransferaccountsController.class).list(null, null, null)).withRel("list"));

}
	public Customertransferaccounts getCustomertransferaccounts() {
return t;
	}


}