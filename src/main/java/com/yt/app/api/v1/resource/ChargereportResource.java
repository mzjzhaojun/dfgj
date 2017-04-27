package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ChargereportController;
import com.yt.app.api.v1.entity.Chargereport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class ChargereportResource extends ResourceSupport {
	private final Chargereport t;

	public ChargereportResource(Chargereport entity) {
		this.t = entity;
		this.add(linkTo(ChargereportController.class).withRel("post"));
		this.add(linkTo(methodOn(ChargereportController.class).list(null, null, null)).withRel("list"));

	}

	public Chargereport getChargereport() {
		return t;
	}

}