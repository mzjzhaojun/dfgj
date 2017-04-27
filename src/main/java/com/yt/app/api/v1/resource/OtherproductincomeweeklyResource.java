package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OtherproductincomeweeklyController;
import com.yt.app.api.v1.entity.Otherproductincomeweekly;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */

public class OtherproductincomeweeklyResource extends ResourceSupport {
	private final Otherproductincomeweekly t;

	public OtherproductincomeweeklyResource(Otherproductincomeweekly entity) {
		this.t = entity;
		this.add(linkTo(OtherproductincomeweeklyController.class).withRel("post"));
		this.add(linkTo(methodOn(OtherproductincomeweeklyController.class).list(null, null, null)).withRel("list"));

	}

	public Otherproductincomeweekly getOtherproductincomeweekly() {
		return t;
	}

}