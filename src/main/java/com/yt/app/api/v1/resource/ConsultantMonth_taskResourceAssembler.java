package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultantMonth_taskController;
import com.yt.app.api.v1.entity.ConsultantMonth_task;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class ConsultantMonth_taskResourceAssembler extends ResourceAssemblerSupport<ConsultantMonth_task, ConsultantMonth_taskResource> {
	public ConsultantMonth_taskResourceAssembler() {
		super(ConsultantMonth_taskController.class, ConsultantMonth_taskResource.class);
	}
	@Override	public ConsultantMonth_taskResource toResource(ConsultantMonth_task t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultantMonth_taskResource instantiateResource(ConsultantMonth_task t) {
		return new ConsultantMonth_taskResource(t);
	}

}