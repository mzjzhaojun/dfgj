package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachcountrycrmmonthsumController;
import com.yt.app.api.v1.entity.Teachcountrycrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class TeachcountrycrmmonthsumResource extends ResourceSupport {
	private final Teachcountrycrmmonthsum t;
	public TeachcountrycrmmonthsumResource(Teachcountrycrmmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachcountrycrmmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachcountrycrmmonthsumController.class).list(null, null, null)).withRel("list"));
		
}
	public Teachcountrycrmmonthsum getTeachcountrycrmmonthsum() {
		return t;
	}


}