package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultstaffperfdaysumController;
import com.yt.app.api.v1.entity.Consultstaffperfdaysum;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:27
*/

public class ConsultstaffperfdaysumResource extends ResourceSupport {
	private final Consultstaffperfdaysum t;
	public ConsultstaffperfdaysumResource(Consultstaffperfdaysum entity) {
		this.t = entity;
		this.add(linkTo(ConsultstaffperfdaysumController.class).withRel("post"));
		this.add(linkTo(methodOn(ConsultstaffperfdaysumController.class).list(null, null, null)).withRel("list"));
		
}
	public Consultstaffperfdaysum getConsultstaffperfdaysum() {
		return t;
	}


}