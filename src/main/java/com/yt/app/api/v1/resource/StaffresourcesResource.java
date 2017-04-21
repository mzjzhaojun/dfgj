package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.StaffresourcesController;
import com.yt.app.api.v1.entity.Staffresources;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:57
*/

public class StaffresourcesResource extends ResourceSupport {
	private final Staffresources t;
	public StaffresourcesResource(Staffresources entity) {
		this.t = entity;
		this.add(linkTo(StaffresourcesController.class).withRel("post"));
		this.add(linkTo(methodOn(StaffresourcesController.class).list(null, null, null)).withRel("list"));
		
}
	public Staffresources getStaffresources() {
		return t;
	}


}