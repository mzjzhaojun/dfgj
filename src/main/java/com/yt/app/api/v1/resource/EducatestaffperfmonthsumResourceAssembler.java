package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatestaffperfmonthsumController;
import com.yt.app.api.v1.entity.Educatestaffperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:42
*/

public class EducatestaffperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Educatestaffperfmonthsum, EducatestaffperfmonthsumResource> {
	public EducatestaffperfmonthsumResourceAssembler() {
		super(EducatestaffperfmonthsumController.class, EducatestaffperfmonthsumResource.class);
	}
	@Override	public EducatestaffperfmonthsumResource toResource(Educatestaffperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatestaffperfmonthsumResource instantiateResource(Educatestaffperfmonthsum t) {
		return new EducatestaffperfmonthsumResource(t);
	}

}