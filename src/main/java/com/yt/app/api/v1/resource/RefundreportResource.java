package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.RefundreportController;
import com.yt.app.api.v1.entity.Refundreport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class RefundreportResource extends ResourceSupport {
	private final Refundreport t;
	public RefundreportResource(Refundreport entity) {
		this.t = entity;
		this.add(linkTo(RefundreportController.class).withRel("post"));
		this.add(linkTo(methodOn(RefundreportController.class).list(null, null, null)).withRel("list"));
		
}
	public Refundreport getRefundreport() {
		return t;
	}


}