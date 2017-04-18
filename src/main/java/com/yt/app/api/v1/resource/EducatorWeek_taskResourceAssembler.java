package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatorWeek_taskController;
import com.yt.app.api.v1.entity.EducatorWeek_task;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatorWeek_taskResourceAssembler extends ResourceAssemblerSupport<EducatorWeek_task, EducatorWeek_taskResource> {
	public EducatorWeek_taskResourceAssembler() {
		super(EducatorWeek_taskController.class, EducatorWeek_taskResource.class);
	}
	@Override	public EducatorWeek_taskResource toResource(EducatorWeek_task t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatorWeek_taskResource instantiateResource(EducatorWeek_task t) {
		return new EducatorWeek_taskResource(t);
	}

}