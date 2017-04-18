package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatecampusperfdaysumController;
import com.yt.app.api.v1.entity.Educatecampusperfdaysum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatecampusperfdaysumResource extends ResourceSupport {
	private final Educatecampusperfdaysum t;
	public EducatecampusperfdaysumResource(Educatecampusperfdaysum entity) {
		this.t = entity;
		this.add(linkTo(EducatecampusperfdaysumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatecampusperfdaysumController.class).list(null, null, null)).withRel("list"));
		
}
	public Educatecampusperfdaysum getEducatecampusperfdaysum() {
		return t;
	}


}