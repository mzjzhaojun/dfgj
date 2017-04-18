package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherDay_taskController;
import com.yt.app.api.v1.entity.TeacherDay_task;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class TeacherDay_taskResourceAssembler extends ResourceAssemblerSupport<TeacherDay_task, TeacherDay_taskResource> {
	public TeacherDay_taskResourceAssembler() {
		super(TeacherDay_taskController.class, TeacherDay_taskResource.class);
	}
	@Override	public TeacherDay_taskResource toResource(TeacherDay_task t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeacherDay_taskResource instantiateResource(TeacherDay_task t) {
		return new TeacherDay_taskResource(t);
	}

}