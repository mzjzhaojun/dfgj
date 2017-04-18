package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultbranchperfmonthsumController;
import com.yt.app.api.v1.entity.Consultbranchperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class ConsultbranchperfmonthsumResource extends ResourceSupport {
	private final Consultbranchperfmonthsum t;
	public ConsultbranchperfmonthsumResource(Consultbranchperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(ConsultbranchperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(ConsultbranchperfmonthsumController.class).list(null, null, null)).withRel("list"));
		
}
	public Consultbranchperfmonthsum getConsultbranchperfmonthsum() {
		return t;
	}


}