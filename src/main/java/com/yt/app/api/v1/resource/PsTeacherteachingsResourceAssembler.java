package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.PsTeacherteachingsController;
import com.yt.app.api.v1.entity.PsTeacherteachings;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class PsTeacherteachingsResourceAssembler extends ResourceAssemblerSupport<PsTeacherteachings, PsTeacherteachingsResource> {
	public PsTeacherteachingsResourceAssembler() {
		super(PsTeacherteachingsController.class, PsTeacherteachingsResource.class);
	}
	@Override	public PsTeacherteachingsResource toResource(PsTeacherteachings t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected PsTeacherteachingsResource instantiateResource(PsTeacherteachings t) {
		return new PsTeacherteachingsResource(t);
	}

}