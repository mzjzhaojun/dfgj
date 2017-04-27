package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AssignconditionsController;
import com.yt.app.api.v1.entity.Assignconditions;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class AssignconditionsResourceAssembler extends ResourceAssemblerSupport<Assignconditions, AssignconditionsResource> {
	public AssignconditionsResourceAssembler() {
super(AssignconditionsController.class, AssignconditionsResource.class);
	}
	@Override	public AssignconditionsResource toResource(Assignconditions t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AssignconditionsResource instantiateResource(Assignconditions t) {
return new AssignconditionsResource(t);
	}

}