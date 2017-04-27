package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatecampusperfmonthsumController;
import com.yt.app.api.v1.entity.Educatecampusperfmonthsum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class EducatecampusperfmonthsumResourceAssembler extends
		ResourceAssemblerSupport<Educatecampusperfmonthsum, EducatecampusperfmonthsumResource> {
	public EducatecampusperfmonthsumResourceAssembler() {
		super(EducatecampusperfmonthsumController.class, EducatecampusperfmonthsumResource.class);
	}

	@Override
	public EducatecampusperfmonthsumResource toResource(Educatecampusperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected EducatecampusperfmonthsumResource instantiateResource(Educatecampusperfmonthsum t) {
		return new EducatecampusperfmonthsumResource(t);
	}

}