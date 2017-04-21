package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeacherteachingsController;
import com.yt.app.api.v1.entity.Teacherteachings;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:01
*/

public class TeacherteachingsResourceAssembler extends ResourceAssemblerSupport<Teacherteachings, TeacherteachingsResource> {
	public TeacherteachingsResourceAssembler() {
		super(TeacherteachingsController.class, TeacherteachingsResource.class);
	}
	@Override	public TeacherteachingsResource toResource(Teacherteachings t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeacherteachingsResource instantiateResource(Teacherteachings t) {
		return new TeacherteachingsResource(t);
	}

}