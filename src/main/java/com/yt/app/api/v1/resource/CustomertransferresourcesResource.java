package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomertransferresourcesController;
import com.yt.app.api.v1.entity.Customertransferresources;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:37
*/

public class CustomertransferresourcesResource extends ResourceSupport {
	private final Customertransferresources t;
	public CustomertransferresourcesResource(Customertransferresources entity) {
		this.t = entity;
		this.add(linkTo(CustomertransferresourcesController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomertransferresourcesController.class).list(null, null, null)).withRel("list"));
		
}
	public Customertransferresources getCustomertransferresources() {
		return t;
	}


}