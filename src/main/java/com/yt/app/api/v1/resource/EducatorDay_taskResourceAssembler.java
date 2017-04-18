package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatorDay_taskController;
import com.yt.app.api.v1.entity.EducatorDay_task;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatorDay_taskResourceAssembler extends ResourceAssemblerSupport<EducatorDay_task, EducatorDay_taskResource> {
	public EducatorDay_taskResourceAssembler() {
		super(EducatorDay_taskController.class, EducatorDay_taskResource.class);
	}
	@Override	public EducatorDay_taskResource toResource(EducatorDay_task t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatorDay_taskResource instantiateResource(EducatorDay_task t) {
		return new EducatorDay_taskResource(t);
	}

}