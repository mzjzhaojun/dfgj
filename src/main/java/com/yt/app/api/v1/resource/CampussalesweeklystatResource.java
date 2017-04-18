package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampussalesweeklystatController;
import com.yt.app.api.v1.entity.Campussalesweeklystat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampussalesweeklystatResource extends ResourceSupport {
	private final Campussalesweeklystat t;
	public CampussalesweeklystatResource(Campussalesweeklystat entity) {
		this.t = entity;
		this.add(linkTo(CampussalesweeklystatController.class).withRel("post"));
		this.add(linkTo(methodOn(CampussalesweeklystatController.class).list(null, null, null)).withRel("list"));
		
}
	public Campussalesweeklystat getCampussalesweeklystat() {
		return t;
	}


}