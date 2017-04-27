package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OrgcampusesController;
import com.yt.app.api.v1.entity.Orgcampuses;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:49
 */

public class OrgcampusesResourceAssembler extends ResourceAssemblerSupport<Orgcampuses, OrgcampusesResource> {
	public OrgcampusesResourceAssembler() {
		super(OrgcampusesController.class, OrgcampusesResource.class);
	}

	@Override
	public OrgcampusesResource toResource(Orgcampuses t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected OrgcampusesResource instantiateResource(Orgcampuses t) {
		return new OrgcampusesResource(t);
	}

}