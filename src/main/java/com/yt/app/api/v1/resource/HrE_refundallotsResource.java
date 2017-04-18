package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.HrE_refundallotsController;
import com.yt.app.api.v1.entity.HrE_refundallots;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrE_refundallotsResource extends ResourceSupport {
	private final HrE_refundallots t;
	public HrE_refundallotsResource(HrE_refundallots entity) {
		this.t = entity;
		this.add(linkTo(HrE_refundallotsController.class).withRel("post"));
		this.add(linkTo(methodOn(HrE_refundallotsController.class).list(null, null, null)).withRel("list"));
		
}
	public HrE_refundallots getHrE_refundallots() {
		return t;
	}


}