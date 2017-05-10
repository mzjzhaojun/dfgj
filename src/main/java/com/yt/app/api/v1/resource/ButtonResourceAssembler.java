package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.yt.app.api.v1.controller.ButtonController;
import com.yt.app.api.v1.entity.Button;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public class ButtonResourceAssembler extends ResourceAssemblerSupport<Button, ButtonResource> {
	public ButtonResourceAssembler() {
		super(ButtonController.class, ButtonResource.class);
	}

	@Override
	public ButtonResource toResource(Button e) {
		return createResourceWithId(e.getId(), e);
	}

	@Override
	protected ButtonResource instantiateResource(Button e) {
		return new ButtonResource(e);
	}

}