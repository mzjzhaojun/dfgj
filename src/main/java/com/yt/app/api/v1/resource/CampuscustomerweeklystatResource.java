package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampuscustomerweeklystatController;
import com.yt.app.api.v1.entity.Campuscustomerweeklystat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampuscustomerweeklystatResource extends ResourceSupport {
	private final Campuscustomerweeklystat t;
	public CampuscustomerweeklystatResource(Campuscustomerweeklystat entity) {
		this.t = entity;
		this.add(linkTo(CampuscustomerweeklystatController.class).withRel("post"));
		this.add(linkTo(methodOn(CampuscustomerweeklystatController.class).list(null, null, null)).withRel("list"));
		
}
	public Campuscustomerweeklystat getCampuscustomerweeklystat() {
		return t;
	}


}