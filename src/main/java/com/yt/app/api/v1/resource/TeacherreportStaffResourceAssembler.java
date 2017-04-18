package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherreportStaffController;
import com.yt.app.api.v1.entity.TeacherreportStaff;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class TeacherreportStaffResourceAssembler extends ResourceAssemblerSupport<TeacherreportStaff, TeacherreportStaffResource> {
	public TeacherreportStaffResourceAssembler() {
		super(TeacherreportStaffController.class, TeacherreportStaffResource.class);
	}
	@Override	public TeacherreportStaffResource toResource(TeacherreportStaff t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeacherreportStaffResource instantiateResource(TeacherreportStaff t) {
		return new TeacherreportStaffResource(t);
	}

}