package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachstaffcrmmonthsumController;
import com.yt.app.api.v1.entity.Teachstaffcrmmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/

public class TeachstaffcrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachstaffcrmmonthsum, TeachstaffcrmmonthsumResource> {
	public TeachstaffcrmmonthsumResourceAssembler() {
super(TeachstaffcrmmonthsumController.class, TeachstaffcrmmonthsumResource.class);
	}
	@Override	public TeachstaffcrmmonthsumResource toResource(Teachstaffcrmmonthsum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachstaffcrmmonthsumResource instantiateResource(Teachstaffcrmmonthsum t) {
return new TeachstaffcrmmonthsumResource(t);
	}

}