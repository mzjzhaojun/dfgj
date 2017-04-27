package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CountryCodeController;
import com.yt.app.api.v1.entity.CountryCode;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CountryCodeResource extends ResourceSupport {
	private final CountryCode t;

	public CountryCodeResource(CountryCode entity) {
		this.t = entity;
		this.add(linkTo(CountryCodeController.class).withRel("post"));
		this.add(linkTo(methodOn(CountryCodeController.class).list(null, null, null)).withRel("list"));

	}

	public CountryCode getCountryCode() {
		return t;
	}

}