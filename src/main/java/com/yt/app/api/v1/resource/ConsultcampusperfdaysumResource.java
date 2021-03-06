package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultcampusperfdaysumController;
import com.yt.app.api.v1.entity.Consultcampusperfdaysum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class ConsultcampusperfdaysumResource extends ResourceSupport {
	private final Consultcampusperfdaysum t;

	public ConsultcampusperfdaysumResource(Consultcampusperfdaysum entity) {
		this.t = entity;
		this.add(linkTo(ConsultcampusperfdaysumController.class).withRel("post"));
		this.add(linkTo(methodOn(ConsultcampusperfdaysumController.class).list(null, null, null)).withRel("list"));

	}

	public Consultcampusperfdaysum getConsultcampusperfdaysum() {
		return t;
	}

}