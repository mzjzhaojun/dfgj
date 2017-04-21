package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachcampuscrmmonthsumController;
import com.yt.app.api.v1.entity.Teachcampuscrmmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:58
*/

public class TeachcampuscrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachcampuscrmmonthsum, TeachcampuscrmmonthsumResource> {
	public TeachcampuscrmmonthsumResourceAssembler() {
		super(TeachcampuscrmmonthsumController.class, TeachcampuscrmmonthsumResource.class);
	}
	@Override	public TeachcampuscrmmonthsumResource toResource(Teachcampuscrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachcampuscrmmonthsumResource instantiateResource(Teachcampuscrmmonthsum t) {
		return new TeachcampuscrmmonthsumResource(t);
	}

}