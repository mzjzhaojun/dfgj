package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CustomerscoresController;
import com.yt.app.api.v1.entity.Customerscores;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public class CustomerscoresResource extends ResourceSupport {
	private final Customerscores t;

	public CustomerscoresResource(Customerscores entity) {
		this.t = entity;
		this.add(linkTo(CustomerscoresController.class).withRel("post"));
		this.add(linkTo(methodOn(CustomerscoresController.class).list(null, null, null)).withRel("list"));

	}

	public Customerscores getCustomerscores() {
		return t;
	}

}