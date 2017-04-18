package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.HrC_refundsController;
import com.yt.app.api.v1.entity.HrC_refunds;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class HrC_refundsResource extends ResourceSupport {
	private final HrC_refunds t;
	public HrC_refundsResource(HrC_refunds entity) {
		this.t = entity;
		this.add(linkTo(HrC_refundsController.class).withRel("post"));
		this.add(linkTo(methodOn(HrC_refundsController.class).list(null, null, null)).withRel("list"));
		
}
	public HrC_refunds getHrC_refunds() {
		return t;
	}


}