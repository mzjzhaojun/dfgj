package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachcountrycrmmonthsumController;
import com.yt.app.api.v1.entity.Teachcountrycrmmonthsum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class TeachcountrycrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachcountrycrmmonthsum, TeachcountrycrmmonthsumResource> {
	public TeachcountrycrmmonthsumResourceAssembler() {
		super(TeachcountrycrmmonthsumController.class, TeachcountrycrmmonthsumResource.class);
	}

	@Override
	public TeachcountrycrmmonthsumResource toResource(Teachcountrycrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected TeachcountrycrmmonthsumResource instantiateResource(Teachcountrycrmmonthsum t) {
		return new TeachcountrycrmmonthsumResource(t);
	}

}