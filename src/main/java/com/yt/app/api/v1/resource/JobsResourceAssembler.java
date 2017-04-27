package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.JobsController;
import com.yt.app.api.v1.entity.Jobs;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class JobsResourceAssembler extends ResourceAssemblerSupport<Jobs, JobsResource> {
	public JobsResourceAssembler() {
		super(JobsController.class, JobsResource.class);
	}

	@Override
	public JobsResource toResource(Jobs t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected JobsResource instantiateResource(Jobs t) {
		return new JobsResource(t);
	}

}