package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampuschargestatController;
import com.yt.app.api.v1.entity.Campuschargestat;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class CampuschargestatResource extends ResourceSupport {
	private final Campuschargestat t;

	public CampuschargestatResource(Campuschargestat entity) {
		this.t = entity;
		this.add(linkTo(CampuschargestatController.class).withRel("post"));
		this.add(linkTo(methodOn(CampuschargestatController.class).list(null, null, null)).withRel("list"));

	}

	public Campuschargestat getCampuschargestat() {
		return t;
	}

}