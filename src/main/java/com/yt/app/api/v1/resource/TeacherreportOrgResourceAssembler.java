package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherreportOrgController;
import com.yt.app.api.v1.entity.TeacherreportOrg;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:01
*/

public class TeacherreportOrgResourceAssembler extends ResourceAssemblerSupport<TeacherreportOrg, TeacherreportOrgResource> {
	public TeacherreportOrgResourceAssembler() {
		super(TeacherreportOrgController.class, TeacherreportOrgResource.class);
	}
	@Override	public TeacherreportOrgResource toResource(TeacherreportOrg t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeacherreportOrgResource instantiateResource(TeacherreportOrg t) {
		return new TeacherreportOrgResource(t);
	}

}