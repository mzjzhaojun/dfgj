package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherrefundallotsController;
import com.yt.app.api.v1.entity.Teacherrefundallots;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/

public class TeacherrefundallotsResourceAssembler extends ResourceAssemblerSupport<Teacherrefundallots, TeacherrefundallotsResource> {
	public TeacherrefundallotsResourceAssembler() {
super(TeacherrefundallotsController.class, TeacherrefundallotsResource.class);
	}
	@Override	public TeacherrefundallotsResource toResource(Teacherrefundallots t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeacherrefundallotsResource instantiateResource(Teacherrefundallots t) {
return new TeacherrefundallotsResource(t);
	}

}