package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PsTeacherteachingsController;
import com.yt.app.api.v1.entity.PsTeacherteachings;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class PsTeacherteachingsResource extends ResourceSupport {
	private final PsTeacherteachings t;
	public PsTeacherteachingsResource(PsTeacherteachings entity) {
		this.t = entity;
		this.add(linkTo(PsTeacherteachingsController.class).withRel("post"));
		this.add(linkTo(methodOn(PsTeacherteachingsController.class).list(null, null, null)).withRel("list"));
		
}
	public PsTeacherteachings getPsTeacherteachings() {
		return t;
	}


}