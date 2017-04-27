package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultcountryperfdaysumController;
import com.yt.app.api.v1.entity.Consultcountryperfdaysum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class ConsultcountryperfdaysumResource extends ResourceSupport {
	private final Consultcountryperfdaysum t;

	public ConsultcountryperfdaysumResource(Consultcountryperfdaysum entity) {
		this.t = entity;
		this.add(linkTo(ConsultcountryperfdaysumController.class).withRel("post"));
		this.add(linkTo(methodOn(ConsultcountryperfdaysumController.class).list(null, null, null)).withRel("list"));

	}

	public Consultcountryperfdaysum getConsultcountryperfdaysum() {
		return t;
	}

}