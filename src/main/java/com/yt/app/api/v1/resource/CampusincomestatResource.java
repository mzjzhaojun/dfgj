package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusincomestatController;
import com.yt.app.api.v1.entity.Campusincomestat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:21
*/

public class CampusincomestatResource extends ResourceSupport {
	private final Campusincomestat t;
	public CampusincomestatResource(Campusincomestat entity) {
		this.t = entity;
		this.add(linkTo(CampusincomestatController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusincomestatController.class).list(null, null, null)).withRel("list"));
		
}
	public Campusincomestat getCampusincomestat() {
		return t;
	}


}