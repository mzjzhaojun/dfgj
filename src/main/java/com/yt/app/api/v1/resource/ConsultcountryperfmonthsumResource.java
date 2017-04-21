package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultcountryperfmonthsumController;
import com.yt.app.api.v1.entity.Consultcountryperfmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:27
*/

public class ConsultcountryperfmonthsumResource extends ResourceSupport {
	private final Consultcountryperfmonthsum t;
	public ConsultcountryperfmonthsumResource(Consultcountryperfmonthsum entity) {
		this.t = entity;
		this.add(linkTo(ConsultcountryperfmonthsumController.class).withRel("post"));
		this.add(linkTo(methodOn(ConsultcountryperfmonthsumController.class).list(null, null, null)).withRel("list"));
		
}
	public Consultcountryperfmonthsum getConsultcountryperfmonthsum() {
		return t;
	}


}