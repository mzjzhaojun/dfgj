package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerscoreitemsController;
import com.yt.app.api.v1.entity.Customerscoreitems;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class CustomerscoreitemsResource extends ResourceSupport {
	private final Customerscoreitems t;

	public CustomerscoreitemsResource(Customerscoreitems entity) {
		this.t = entity;
		this.add(linkTo(CustomerscoreitemsController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerscoreitemsController.class).list(null, null, null)).withRel("list"));

	}

	public Customerscoreitems getCustomerscoreitems() {
		return t;
	}

}