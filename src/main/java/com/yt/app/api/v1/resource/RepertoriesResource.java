package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.RepertoriesController;
import com.yt.app.api.v1.entity.Repertories;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class RepertoriesResource extends ResourceSupport {
	private final Repertories t;
	public RepertoriesResource(Repertories entity) {
		this.t = entity;
		this.add(linkTo(RepertoriesController.class).withRel("post"));
		this.add(linkTo(methodOn(RepertoriesController.class).list(null, null, null)).withRel("list"));
		
}
	public Repertories getRepertories() {
		return t;
	}


}