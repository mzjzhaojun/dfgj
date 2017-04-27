package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultbranchcrmmonthsumController;
import com.yt.app.api.v1.entity.Consultbranchcrmmonthsum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class ConsultbranchcrmmonthsumResource extends ResourceSupport {
	private final Consultbranchcrmmonthsum t;
	public ConsultbranchcrmmonthsumResource(Consultbranchcrmmonthsum entity) {
this.t = entity;
this.add(linkTo(ConsultbranchcrmmonthsumController.class).withRel("post"));
this.add(linkTo(methodOn(ConsultbranchcrmmonthsumController.class).list(null, null, null)).withRel("list"));

}
	public Consultbranchcrmmonthsum getConsultbranchcrmmonthsum() {
return t;
	}


}