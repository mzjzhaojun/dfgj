package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatecampuscrmmonthsumController;
import com.yt.app.api.v1.entity.Educatecampuscrmmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class EducatecampuscrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Educatecampuscrmmonthsum, EducatecampuscrmmonthsumResource> {
	public EducatecampuscrmmonthsumResourceAssembler() {
super(EducatecampuscrmmonthsumController.class, EducatecampuscrmmonthsumResource.class);
	}
	@Override	public EducatecampuscrmmonthsumResource toResource(Educatecampuscrmmonthsum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatecampuscrmmonthsumResource instantiateResource(Educatecampuscrmmonthsum t) {
return new EducatecampuscrmmonthsumResource(t);
	}

}