package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachstaffperfmonthsumController;
import com.yt.app.api.v1.entity.Teachstaffperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

public class TeachstaffperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachstaffperfmonthsum, TeachstaffperfmonthsumResource> {
	public TeachstaffperfmonthsumResourceAssembler() {
		super(TeachstaffperfmonthsumController.class, TeachstaffperfmonthsumResource.class);
	}
	@Override	public TeachstaffperfmonthsumResource toResource(Teachstaffperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachstaffperfmonthsumResource instantiateResource(Teachstaffperfmonthsum t) {
		return new TeachstaffperfmonthsumResource(t);
	}

}