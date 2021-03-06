package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.StudentstatusreportController;
import com.yt.app.api.v1.entity.Studentstatusreport;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public class StudentstatusreportResourceAssembler extends ResourceAssemblerSupport<Studentstatusreport, StudentstatusreportResource> {
	public StudentstatusreportResourceAssembler() {
		super(StudentstatusreportController.class, StudentstatusreportResource.class);
	}

	@Override
	public StudentstatusreportResource toResource(Studentstatusreport t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected StudentstatusreportResource instantiateResource(Studentstatusreport t) {
		return new StudentstatusreportResource(t);
	}

}