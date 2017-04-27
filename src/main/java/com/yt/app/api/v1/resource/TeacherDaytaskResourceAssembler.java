package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherDaytaskController;
import com.yt.app.api.v1.entity.TeacherDaytask;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

public class TeacherDaytaskResourceAssembler extends ResourceAssemblerSupport<TeacherDaytask, TeacherDaytaskResource> {
	public TeacherDaytaskResourceAssembler() {
		super(TeacherDaytaskController.class, TeacherDaytaskResource.class);
	}

	@Override
	public TeacherDaytaskResource toResource(TeacherDaytask t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected TeacherDaytaskResource instantiateResource(TeacherDaytask t) {
		return new TeacherDaytaskResource(t);
	}

}