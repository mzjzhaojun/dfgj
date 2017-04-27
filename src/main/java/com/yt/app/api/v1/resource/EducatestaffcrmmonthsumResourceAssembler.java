package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatestaffcrmmonthsumController;
import com.yt.app.api.v1.entity.Educatestaffcrmmonthsum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class EducatestaffcrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Educatestaffcrmmonthsum, EducatestaffcrmmonthsumResource> {
	public EducatestaffcrmmonthsumResourceAssembler() {
		super(EducatestaffcrmmonthsumController.class, EducatestaffcrmmonthsumResource.class);
	}

	@Override
	public EducatestaffcrmmonthsumResource toResource(Educatestaffcrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected EducatestaffcrmmonthsumResource instantiateResource(Educatestaffcrmmonthsum t) {
		return new EducatestaffcrmmonthsumResource(t);
	}

}