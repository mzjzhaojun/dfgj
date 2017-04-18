package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.HrD_chargeallotsController;
import com.yt.app.api.v1.entity.HrD_chargeallots;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrD_chargeallotsResource extends ResourceSupport {
	private final HrD_chargeallots t;
	public HrD_chargeallotsResource(HrD_chargeallots entity) {
		this.t = entity;
		this.add(linkTo(HrD_chargeallotsController.class).withRel("post"));
		this.add(linkTo(methodOn(HrD_chargeallotsController.class).list(null, null, null)).withRel("list"));
		
}
	public HrD_chargeallots getHrD_chargeallots() {
		return t;
	}


}