package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatecountrycrmmonthsumController;
import com.yt.app.api.v1.entity.Educatecountrycrmmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:41
*/

public class EducatecountrycrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Educatecountrycrmmonthsum, EducatecountrycrmmonthsumResource> {
	public EducatecountrycrmmonthsumResourceAssembler() {
		super(EducatecountrycrmmonthsumController.class, EducatecountrycrmmonthsumResource.class);
	}
	@Override	public EducatecountrycrmmonthsumResource toResource(Educatecountrycrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatecountrycrmmonthsumResource instantiateResource(Educatecountrycrmmonthsum t) {
		return new EducatecountrycrmmonthsumResource(t);
	}

}