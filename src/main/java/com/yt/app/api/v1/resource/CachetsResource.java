package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CachetsController;
import com.yt.app.api.v1.entity.Cachets;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CachetsResource extends ResourceSupport {
	private final Cachets t;
	public CachetsResource(Cachets entity) {
		this.t = entity;
		this.add(linkTo(CachetsController.class).withRel("post"));
		this.add(linkTo(methodOn(CachetsController.class).list(null, null, null)).withRel("list"));
		
}
	public Cachets getCachets() {
		return t;
	}


}