package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AssetsController;
import com.yt.app.api.v1.entity.Assets;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AssetsResource extends ResourceSupport {
	private final Assets t;
	public AssetsResource(Assets entity) {
		this.t = entity;
		this.add(linkTo(AssetsController.class).withRel("post"));
		this.add(linkTo(methodOn(AssetsController.class).list(null, null, null)).withRel("list"));
		
}
	public Assets getAssets() {
		return t;
	}


}