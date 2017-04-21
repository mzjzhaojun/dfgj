package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.JobcodeController;
import com.yt.app.api.v1.entity.Jobcode;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:16
*/

public class JobcodeResourceAssembler extends ResourceAssemblerSupport<Jobcode, JobcodeResource> {
	public JobcodeResourceAssembler() {
		super(JobcodeController.class, JobcodeResource.class);
	}
	@Override	public JobcodeResource toResource(Jobcode t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected JobcodeResource instantiateResource(Jobcode t) {
		return new JobcodeResource(t);
	}

}