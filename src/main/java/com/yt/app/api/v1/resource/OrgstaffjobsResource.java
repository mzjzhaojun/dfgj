package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrgstaffjobsController;
import com.yt.app.api.v1.entity.Orgstaffjobs;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:49
*/

public class OrgstaffjobsResource extends ResourceSupport {
	private final Orgstaffjobs t;
	public OrgstaffjobsResource(Orgstaffjobs entity) {
		this.t = entity;
		this.add(linkTo(OrgstaffjobsController.class).withRel("post"));
		this.add(linkTo(methodOn(OrgstaffjobsController.class).list(null, null, null)).withRel("list"));
		
}
	public Orgstaffjobs getOrgstaffjobs() {
		return t;
	}


}