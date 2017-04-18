package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.DebookorderitemsController;
import com.yt.app.api.v1.entity.Debookorderitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class DebookorderitemsResource extends ResourceSupport {
	private final Debookorderitems t;
	public DebookorderitemsResource(Debookorderitems entity) {
		this.t = entity;
		this.add(linkTo(DebookorderitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(DebookorderitemsController.class).list(null, null, null)).withRel("list"));
		
}
	public Debookorderitems getDebookorderitems() {
		return t;
	}


}