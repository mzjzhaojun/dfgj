package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.StudentstatusreportController;
import com.yt.app.api.v1.entity.Studentstatusreport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:58
*/

public class StudentstatusreportResource extends ResourceSupport {
	private final Studentstatusreport t;
	public StudentstatusreportResource(Studentstatusreport entity) {
		this.t = entity;
		this.add(linkTo(StudentstatusreportController.class).withRel("post"));
		this.add(linkTo(methodOn(StudentstatusreportController.class).list(null, null, null)).withRel("list"));
		
}
	public Studentstatusreport getStudentstatusreport() {
		return t;
	}


}