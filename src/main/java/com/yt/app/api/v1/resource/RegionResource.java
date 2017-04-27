package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.RegionController;
import com.yt.app.api.v1.entity.Region;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-11-04 15:40:04
 */

public class RegionResource extends ResourceSupport {
	private final Region t;

	public RegionResource(Region entity) {
		this.t = entity;
		this.add(linkTo(RegionController.class).withRel("post"));
		this.add(linkTo(methodOn(RegionController.class).list(null, null, null)).withRel("list"));

	}

	public Region getRegion() {
		return t;
	}

}