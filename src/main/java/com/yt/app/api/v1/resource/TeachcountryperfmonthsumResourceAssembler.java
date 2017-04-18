package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachcountryperfmonthsumController;
import com.yt.app.api.v1.entity.Teachcountryperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class TeachcountryperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachcountryperfmonthsum, TeachcountryperfmonthsumResource> {
	public TeachcountryperfmonthsumResourceAssembler() {
		super(TeachcountryperfmonthsumController.class, TeachcountryperfmonthsumResource.class);
	}
	@Override	public TeachcountryperfmonthsumResource toResource(Teachcountryperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachcountryperfmonthsumResource instantiateResource(Teachcountryperfmonthsum t) {
		return new TeachcountryperfmonthsumResource(t);
	}

}