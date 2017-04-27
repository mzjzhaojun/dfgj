package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OrgbranchesController;
import com.yt.app.api.v1.entity.Orgbranches;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:49
 */

public class OrgbranchesResource extends ResourceSupport {
	private final Orgbranches t;

	public OrgbranchesResource(Orgbranches entity) {
		this.t = entity;
		this.add(linkTo(OrgbranchesController.class).withRel("post"));
		this.add(linkTo(methodOn(OrgbranchesController.class).list(null, null, null)).withRel("list"));

	}

	public Orgbranches getOrgbranches() {
		return t;
	}

}