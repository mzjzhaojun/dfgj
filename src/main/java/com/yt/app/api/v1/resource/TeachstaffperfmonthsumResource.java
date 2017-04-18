package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.TeachstaffperfmonthsumController;
import com.yt.app.api.v1.entity.Teachstaffperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class TeachstaffperfmonthsumResource extends ResourceSupport {
	private final Teachstaffperfmonthsum t;
	public TeachstaffperfmonthsumResource(Teachstaffperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(TeachstaffperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(TeachstaffperfmonthsumController.class).list(null, null, null)).withRel("list"));
		
}
	public Teachstaffperfmonthsum getTeachstaffperfmonthsum() {
		return t;
	}


}