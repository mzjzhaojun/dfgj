package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.MenuLinksController;
import com.yt.app.api.v1.entity.MenuLinks;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-14 10:16:02
*/

public class MenuLinksResourceAssembler extends ResourceAssemblerSupport<MenuLinks, MenuLinksResource> {
	public MenuLinksResourceAssembler() {
		super(MenuLinksController.class, MenuLinksResource.class);
	}
	@Override	public MenuLinksResource toResource(MenuLinks t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected MenuLinksResource instantiateResource(MenuLinks t) {
		return new MenuLinksResource(t);
	}

}