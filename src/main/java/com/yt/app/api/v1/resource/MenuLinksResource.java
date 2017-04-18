package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.MenuLinksController;
import com.yt.app.api.v1.entity.MenuLinks;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-14 10:16:02
*/

public class MenuLinksResource extends ResourceSupport {
	private final MenuLinks t;
	public MenuLinksResource(MenuLinks entity) {
		this.t = entity;
		this.add(linkTo(MenuLinksController.class).withRel("post"));
		this.add(linkTo(methodOn(MenuLinksController.class).list(null, null, null)).withRel("list"));
		
}
	public MenuLinks getMenuLinks() {
		return t;
	}


}