package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PresentitemsController;
import com.yt.app.api.v1.entity.Presentitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class PresentitemsResource extends ResourceSupport {
	private final Presentitems t;
	public PresentitemsResource(Presentitems entity) {
this.t = entity;
this.add(linkTo(PresentitemsController.class).withRel("post"));
this.add(linkTo(methodOn(PresentitemsController.class).list(null, null, null)).withRel("list"));

}
	public Presentitems getPresentitems() {
return t;
	}


}