package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PosrecordsController;
import com.yt.app.api.v1.entity.Posrecords;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class PosrecordsResource extends ResourceSupport {
	private final Posrecords t;
	public PosrecordsResource(Posrecords entity) {
this.t = entity;
this.add(linkTo(PosrecordsController.class).withRel("post"));
this.add(linkTo(methodOn(PosrecordsController.class).list(null, null, null)).withRel("list"));

}
	public Posrecords getPosrecords() {
return t;
	}


}