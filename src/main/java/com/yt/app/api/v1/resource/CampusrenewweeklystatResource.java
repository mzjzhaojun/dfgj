package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusrenewweeklystatController;
import com.yt.app.api.v1.entity.Campusrenewweeklystat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:22
*/

public class CampusrenewweeklystatResource extends ResourceSupport {
	private final Campusrenewweeklystat t;
	public CampusrenewweeklystatResource(Campusrenewweeklystat entity) {
		this.t = entity;
		this.add(linkTo(CampusrenewweeklystatController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusrenewweeklystatController.class).list(null, null, null)).withRel("list"));
		
}
	public Campusrenewweeklystat getCampusrenewweeklystat() {
		return t;
	}


}