package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeacherchargeallotsController;
import com.yt.app.api.v1.entity.Teacherchargeallots;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/

public class TeacherchargeallotsResource extends ResourceSupport {
	private final Teacherchargeallots t;
	public TeacherchargeallotsResource(Teacherchargeallots entity) {
this.t = entity;
this.add(linkTo(TeacherchargeallotsController.class).withRel("post"));
this.add(linkTo(methodOn(TeacherchargeallotsController.class).list(null, null, null)).withRel("list"));

}
	public Teacherchargeallots getTeacherchargeallots() {
return t;
	}


}