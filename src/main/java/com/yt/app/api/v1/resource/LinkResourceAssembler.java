package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.LinkController;
import com.yt.app.api.v1.entity.Link;



/**
* @author ssh
* 
* @version v1
* @createdate  2016-10-14 10:17:35
*/

public class LinkResourceAssembler extends ResourceAssemblerSupport<Link, LinkResource> {
	public LinkResourceAssembler() {
		super(LinkController.class, LinkResource.class);
	}
	@Override	public LinkResource toResource(Link t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected LinkResource instantiateResource(Link t) {
		return new LinkResource(t);
	}

}