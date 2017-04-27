package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatebranchperfmonthsumController;
import com.yt.app.api.v1.entity.Educatebranchperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class EducatebranchperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Educatebranchperfmonthsum, EducatebranchperfmonthsumResource> {
	public EducatebranchperfmonthsumResourceAssembler() {
super(EducatebranchperfmonthsumController.class, EducatebranchperfmonthsumResource.class);
	}
	@Override	public EducatebranchperfmonthsumResource toResource(Educatebranchperfmonthsum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatebranchperfmonthsumResource instantiateResource(Educatebranchperfmonthsum t) {
return new EducatebranchperfmonthsumResource(t);
	}

}