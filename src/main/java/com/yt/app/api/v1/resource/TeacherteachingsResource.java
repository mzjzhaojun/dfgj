package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherteachingsController;
import com.yt.app.api.v1.entity.Teacherteachings;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/

public class TeacherteachingsResource extends ResourceSupport {
	private final Teacherteachings t;
	public TeacherteachingsResource(Teacherteachings entity) {
this.t = entity;
this.add(linkTo(TeacherteachingsController.class).withRel("post"));
this.add(linkTo(methodOn(TeacherteachingsController.class).list(null, null, null)).withRel("list"));

}
	public Teacherteachings getTeacherteachings() {
return t;
	}


}