package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachcampusperfmonthsumController;
import com.yt.app.api.v1.entity.Teachcampusperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class TeachcampusperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachcampusperfmonthsum, TeachcampusperfmonthsumResource> {
	public TeachcampusperfmonthsumResourceAssembler() {
super(TeachcampusperfmonthsumController.class, TeachcampusperfmonthsumResource.class);
	}
	@Override	public TeachcampusperfmonthsumResource toResource(Teachcampusperfmonthsum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachcampusperfmonthsumResource instantiateResource(Teachcampusperfmonthsum t) {
return new TeachcampusperfmonthsumResource(t);
	}

}