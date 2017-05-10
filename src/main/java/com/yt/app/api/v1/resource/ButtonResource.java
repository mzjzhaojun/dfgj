package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;

import com.yt.app.api.v1.controller.ButtonController;
import com.yt.app.api.v1.entity.Button;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public class ButtonResource extends ResourceSupport {
	private final Button e;

	public ButtonResource(Button ee) {
		Long id = ee.getId();
		this.e = ee;
		this.add(linkTo(ButtonController.class, id).withRel("collection"));
	}

	public Button getButton() {
		return e;
	}

}