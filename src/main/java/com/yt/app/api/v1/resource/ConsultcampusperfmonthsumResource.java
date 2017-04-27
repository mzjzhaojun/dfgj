package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultcampusperfmonthsumController;
import com.yt.app.api.v1.entity.Consultcampusperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */

public class ConsultcampusperfmonthsumResource extends ResourceSupport {
	private final Consultcampusperfmonthsum t;

	public ConsultcampusperfmonthsumResource(Consultcampusperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(ConsultcampusperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(ConsultcampusperfmonthsumController.class).list(null, null, null)).withRel("list"));

	}

	public Consultcampusperfmonthsum getConsultcampusperfmonthsum() {
		return t;
	}

}