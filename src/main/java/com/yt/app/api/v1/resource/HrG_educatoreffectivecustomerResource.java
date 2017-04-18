package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.HrG_educatoreffectivecustomerController;
import com.yt.app.api.v1.entity.HrG_educatoreffectivecustomer;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrG_educatoreffectivecustomerResource extends ResourceSupport {
	private final HrG_educatoreffectivecustomer t;
	public HrG_educatoreffectivecustomerResource(HrG_educatoreffectivecustomer entity) {
		this.t = entity;
		this.add(linkTo(HrG_educatoreffectivecustomerController.class).withRel("post"));
		this.add(linkTo(methodOn(HrG_educatoreffectivecustomerController.class).list(null, null, null)).withRel("list"));
		
}
	public HrG_educatoreffectivecustomer getHrG_educatoreffectivecustomer() {
		return t;
	}


}