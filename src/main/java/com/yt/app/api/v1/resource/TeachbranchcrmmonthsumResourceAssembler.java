package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachbranchcrmmonthsumController;
import com.yt.app.api.v1.entity.Teachbranchcrmmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class TeachbranchcrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachbranchcrmmonthsum, TeachbranchcrmmonthsumResource> {
	public TeachbranchcrmmonthsumResourceAssembler() {
		super(TeachbranchcrmmonthsumController.class, TeachbranchcrmmonthsumResource.class);
	}
	@Override	public TeachbranchcrmmonthsumResource toResource(Teachbranchcrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachbranchcrmmonthsumResource instantiateResource(Teachbranchcrmmonthsum t) {
		return new TeachbranchcrmmonthsumResource(t);
	}

}