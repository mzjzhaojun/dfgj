package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultcampusperfdaysumController;
import com.yt.app.api.v1.entity.Consultcampusperfdaysum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:26
*/

public class ConsultcampusperfdaysumResourceAssembler extends ResourceAssemblerSupport<Consultcampusperfdaysum, ConsultcampusperfdaysumResource> {
	public ConsultcampusperfdaysumResourceAssembler() {
		super(ConsultcampusperfdaysumController.class, ConsultcampusperfdaysumResource.class);
	}
	@Override	public ConsultcampusperfdaysumResource toResource(Consultcampusperfdaysum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultcampusperfdaysumResource instantiateResource(Consultcampusperfdaysum t) {
		return new ConsultcampusperfdaysumResource(t);
	}

}