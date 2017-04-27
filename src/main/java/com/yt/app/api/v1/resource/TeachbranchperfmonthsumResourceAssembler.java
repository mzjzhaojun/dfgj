package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachbranchperfmonthsumController;
import com.yt.app.api.v1.entity.Teachbranchperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class TeachbranchperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachbranchperfmonthsum, TeachbranchperfmonthsumResource> {
	public TeachbranchperfmonthsumResourceAssembler() {
super(TeachbranchperfmonthsumController.class, TeachbranchperfmonthsumResource.class);
	}
	@Override	public TeachbranchperfmonthsumResource toResource(Teachbranchperfmonthsum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachbranchperfmonthsumResource instantiateResource(Teachbranchperfmonthsum t) {
return new TeachbranchperfmonthsumResource(t);
	}

}