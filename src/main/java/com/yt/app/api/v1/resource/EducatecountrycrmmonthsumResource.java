package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.EducatecountrycrmmonthsumController;
import com.yt.app.api.v1.entity.Educatecountrycrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:41
*/

public class EducatecountrycrmmonthsumResource extends ResourceSupport {
	private final Educatecountrycrmmonthsum t;
	public EducatecountrycrmmonthsumResource(Educatecountrycrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(EducatecountrycrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(EducatecountrycrmmonthsumController.class).list(null, null, null)).withRel("list"));
		
}
	public Educatecountrycrmmonthsum getEducatecountrycrmmonthsum() {
		return t;
	}


}