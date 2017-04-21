package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrgcampusesController;
import com.yt.app.api.v1.entity.Orgcampuses;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:49
*/

public class OrgcampusesResource extends ResourceSupport {
	private final Orgcampuses t;
	public OrgcampusesResource(Orgcampuses entity) {
		this.t = entity;
		this.add(linkTo(OrgcampusesController.class).withRel("post"));
		this.add(linkTo(methodOn(OrgcampusesController.class).list(null, null, null)).withRel("list"));
		
}
	public Orgcampuses getOrgcampuses() {
		return t;
	}


}