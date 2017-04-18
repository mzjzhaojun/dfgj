package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AssignsaccompaniesController;
import com.yt.app.api.v1.entity.Assignsaccompanies;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AssignsaccompaniesResource extends ResourceSupport {
	private final Assignsaccompanies t;
	public AssignsaccompaniesResource(Assignsaccompanies entity) {
		this.t = entity;
		this.add(linkTo(AssignsaccompaniesController.class).withRel("post"));
		this.add(linkTo(methodOn(AssignsaccompaniesController.class).list(null, null, null)).withRel("list"));
		
}
	public Assignsaccompanies getAssignsaccompanies() {
		return t;
	}


}