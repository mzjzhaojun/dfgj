package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachcampuscrmmonthsumController;
import com.yt.app.api.v1.entity.Teachcampuscrmmonthsum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class TeachcampuscrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachcampuscrmmonthsum, TeachcampuscrmmonthsumResource> {
	public TeachcampuscrmmonthsumResourceAssembler() {
		super(TeachcampuscrmmonthsumController.class, TeachcampuscrmmonthsumResource.class);
	}

	@Override
	public TeachcampuscrmmonthsumResource toResource(Teachcampuscrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected TeachcampuscrmmonthsumResource instantiateResource(Teachcampuscrmmonthsum t) {
		return new TeachcampuscrmmonthsumResource(t);
	}

}