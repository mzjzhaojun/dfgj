package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.RoomsController;
import com.yt.app.api.v1.entity.Rooms;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class RoomsResource extends ResourceSupport {
	private final Rooms t;
	public RoomsResource(Rooms entity) {
this.t = entity;
this.add(linkTo(RoomsController.class).withRel("post"));
this.add(linkTo(methodOn(RoomsController.class).list(null, null, null)).withRel("list"));

}
	public Rooms getRooms() {
return t;
	}


}