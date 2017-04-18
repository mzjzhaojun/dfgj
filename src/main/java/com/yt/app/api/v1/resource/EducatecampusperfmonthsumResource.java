package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatecampusperfmonthsumController;
import com.yt.app.api.v1.entity.Educatecampusperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatecampusperfmonthsumResource extends ResourceSupport {
	private final Educatecampusperfmonthsum t;
	public EducatecampusperfmonthsumResource(Educatecampusperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatecampusperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatecampusperfmonthsumController.class).list(null, null, null)).withRel("list"));
		
}
	public Educatecampusperfmonthsum getEducatecampusperfmonthsum() {
		return t;
	}


}