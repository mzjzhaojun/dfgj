package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrgregionsController;
import com.yt.app.api.v1.entity.Orgregions;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:49
*/

public class OrgregionsResource extends ResourceSupport {
	private final Orgregions t;
	public OrgregionsResource(Orgregions entity) {
		this.t = entity;
		this.add(linkTo(OrgregionsController.class).withRel("post"));
		this.add(linkTo(methodOn(OrgregionsController.class).list(null, null, null)).withRel("list"));
		
}
	public Orgregions getOrgregions() {
		return t;
	}


}