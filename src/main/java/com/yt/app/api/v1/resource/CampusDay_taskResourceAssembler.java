package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusDay_taskController;
import com.yt.app.api.v1.entity.CampusDay_task;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampusDay_taskResourceAssembler extends ResourceAssemblerSupport<CampusDay_task, CampusDay_taskResource> {
	public CampusDay_taskResourceAssembler() {
		super(CampusDay_taskController.class, CampusDay_taskResource.class);
	}
	@Override	public CampusDay_taskResource toResource(CampusDay_task t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampusDay_taskResource instantiateResource(CampusDay_task t) {
		return new CampusDay_taskResource(t);
	}

}