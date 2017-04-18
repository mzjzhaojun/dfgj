package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ParentsController;
import com.yt.app.api.v1.entity.Parents;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class ParentsResourceAssembler extends ResourceAssemblerSupport<Parents, ParentsResource> {
	public ParentsResourceAssembler() {
		super(ParentsController.class, ParentsResource.class);
	}
	@Override	public ParentsResource toResource(Parents t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ParentsResource instantiateResource(Parents t) {
		return new ParentsResource(t);
	}

}