package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusincomeweeklystatController;
import com.yt.app.api.v1.entity.Campusincomeweeklystat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:21
*/

public class CampusincomeweeklystatResource extends ResourceSupport {
	private final Campusincomeweeklystat t;
	public CampusincomeweeklystatResource(Campusincomeweeklystat entity) {
		this.t = entity;
		this.add(linkTo(CampusincomeweeklystatController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusincomeweeklystatController.class).list(null, null, null)).withRel("list"));
		
}
	public Campusincomeweeklystat getCampusincomeweeklystat() {
		return t;
	}


}