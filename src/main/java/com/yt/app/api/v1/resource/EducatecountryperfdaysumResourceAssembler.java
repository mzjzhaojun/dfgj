package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatecountryperfdaysumController;
import com.yt.app.api.v1.entity.Educatecountryperfdaysum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:41
*/

public class EducatecountryperfdaysumResourceAssembler extends ResourceAssemblerSupport<Educatecountryperfdaysum, EducatecountryperfdaysumResource> {
	public EducatecountryperfdaysumResourceAssembler() {
		super(EducatecountryperfdaysumController.class, EducatecountryperfdaysumResource.class);
	}
	@Override	public EducatecountryperfdaysumResource toResource(Educatecountryperfdaysum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatecountryperfdaysumResource instantiateResource(Educatecountryperfdaysum t) {
		return new EducatecountryperfdaysumResource(t);
	}

}