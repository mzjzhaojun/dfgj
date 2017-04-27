package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherchargeallotsController;
import com.yt.app.api.v1.entity.Teacherchargeallots;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:50
 */

public class TeacherchargeallotsResourceAssembler extends ResourceAssemblerSupport<Teacherchargeallots, TeacherchargeallotsResource> {
	public TeacherchargeallotsResourceAssembler() {
		super(TeacherchargeallotsController.class, TeacherchargeallotsResource.class);
	}

	@Override
	public TeacherchargeallotsResource toResource(Teacherchargeallots t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected TeacherchargeallotsResource instantiateResource(Teacherchargeallots t) {
		return new TeacherchargeallotsResource(t);
	}

}