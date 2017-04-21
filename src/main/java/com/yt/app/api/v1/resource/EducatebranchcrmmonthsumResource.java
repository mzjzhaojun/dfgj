package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatebranchcrmmonthsumController;
import com.yt.app.api.v1.entity.Educatebranchcrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:39
*/

public class EducatebranchcrmmonthsumResource extends ResourceSupport {
	private final Educatebranchcrmmonthsum t;
	public EducatebranchcrmmonthsumResource(Educatebranchcrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatebranchcrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatebranchcrmmonthsumController.class).list(null, null, null)).withRel("list"));
		
}
	public Educatebranchcrmmonthsum getEducatebranchcrmmonthsum() {
		return t;
	}


}