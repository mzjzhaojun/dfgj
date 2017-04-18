package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomertransferappliesController;
import com.yt.app.api.v1.entity.Customertransferapplies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class CustomertransferappliesResource extends ResourceSupport {
	private final Customertransferapplies t;
	public CustomertransferappliesResource(Customertransferapplies entity) {
		this.t = entity;
		this.add(linkTo(CustomertransferappliesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomertransferappliesController.class).list(null, null, null)).withRel("list"));
		
}
	public Customertransferapplies getCustomertransferapplies() {
		return t;
	}


}