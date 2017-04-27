package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachgroupperfmonthsumController;
import com.yt.app.api.v1.entity.Teachgroupperfmonthsum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

public class TeachgroupperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachgroupperfmonthsum, TeachgroupperfmonthsumResource> {
	public TeachgroupperfmonthsumResourceAssembler() {
		super(TeachgroupperfmonthsumController.class, TeachgroupperfmonthsumResource.class);
	}

	@Override
	public TeachgroupperfmonthsumResource toResource(Teachgroupperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected TeachgroupperfmonthsumResource instantiateResource(Teachgroupperfmonthsum t) {
		return new TeachgroupperfmonthsumResource(t);
	}

}