package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.MenuController;
import com.yt.app.api.v1.entity.Menu;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public class MenuResource extends ResourceSupport {
	private final Menu t;

	public MenuResource(Menu entity) {
		this.t = entity;
		this.add(linkTo(MenuController.class).withRel("post"));
		this.add(linkTo(methodOn(MenuController.class).list(null, null, null)).withRel("list"));

	}

	public Menu getMenu() {
		return t;
	}

}