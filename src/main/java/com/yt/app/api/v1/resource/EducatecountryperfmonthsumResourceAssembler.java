package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatecountryperfmonthsumController;
import com.yt.app.api.v1.entity.Educatecountryperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class EducatecountryperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Educatecountryperfmonthsum, EducatecountryperfmonthsumResource> {
	public EducatecountryperfmonthsumResourceAssembler() {
		super(EducatecountryperfmonthsumController.class, EducatecountryperfmonthsumResource.class);
	}
	@Override	public EducatecountryperfmonthsumResource toResource(Educatecountryperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatecountryperfmonthsumResource instantiateResource(Educatecountryperfmonthsum t) {
		return new EducatecountryperfmonthsumResource(t);
	}

}