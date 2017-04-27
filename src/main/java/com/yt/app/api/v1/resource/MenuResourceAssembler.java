package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.MenuController;
import com.yt.app.api.v1.entity.Menu;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public class MenuResourceAssembler extends ResourceAssemblerSupport<Menu, MenuResource> {
	public MenuResourceAssembler() {
		super(MenuController.class, MenuResource.class);
	}

	@Override
	public MenuResource toResource(Menu t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected MenuResource instantiateResource(Menu t) {
		return new MenuResource(t);
	}

}