package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampustaxrateconfigController;
import com.yt.app.api.v1.entity.Campustaxrateconfig;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class CampustaxrateconfigResource extends ResourceSupport {
	private final Campustaxrateconfig t;
	public CampustaxrateconfigResource(Campustaxrateconfig entity) {
this.t = entity;
this.add(linkTo(CampustaxrateconfigController.class).withRel("post"));
this.add(linkTo(methodOn(CampustaxrateconfigController.class).list(null, null, null)).withRel("list"));

}
	public Campustaxrateconfig getCampustaxrateconfig() {
return t;
	}


}