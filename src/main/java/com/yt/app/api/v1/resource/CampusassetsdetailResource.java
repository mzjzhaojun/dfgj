package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusassetsdetailController;
import com.yt.app.api.v1.entity.Campusassetsdetail;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CampusassetsdetailResource extends ResourceSupport {
	private final Campusassetsdetail t;

	public CampusassetsdetailResource(Campusassetsdetail entity) {
		this.t = entity;
		this.add(linkTo(CampusassetsdetailController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusassetsdetailController.class).list(null, null, null)).withRel("list"));

	}

	public Campusassetsdetail getCampusassetsdetail() {
		return t;
	}

}