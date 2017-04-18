package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusMonth_taskController;
import com.yt.app.api.v1.entity.CampusMonth_task;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class CampusMonth_taskResourceAssembler extends ResourceAssemblerSupport<CampusMonth_task, CampusMonth_taskResource> {
	public CampusMonth_taskResourceAssembler() {
		super(CampusMonth_taskController.class, CampusMonth_taskResource.class);
	}
	@Override	public CampusMonth_taskResource toResource(CampusMonth_task t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected CampusMonth_taskResource instantiateResource(CampusMonth_task t) {
		return new CampusMonth_taskResource(t);
	}

}