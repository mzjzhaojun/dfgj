package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatebranchcrmmonthsumController;
import com.yt.app.api.v1.entity.Educatebranchcrmmonthsum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class EducatebranchcrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Educatebranchcrmmonthsum, EducatebranchcrmmonthsumResource> {
	public EducatebranchcrmmonthsumResourceAssembler() {
		super(EducatebranchcrmmonthsumController.class, EducatebranchcrmmonthsumResource.class);
	}

	@Override
	public EducatebranchcrmmonthsumResource toResource(Educatebranchcrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected EducatebranchcrmmonthsumResource instantiateResource(Educatebranchcrmmonthsum t) {
		return new EducatebranchcrmmonthsumResource(t);
	}

}