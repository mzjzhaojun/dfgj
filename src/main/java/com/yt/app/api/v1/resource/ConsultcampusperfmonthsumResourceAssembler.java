package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultcampusperfmonthsumController;
import com.yt.app.api.v1.entity.Consultcampusperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class ConsultcampusperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Consultcampusperfmonthsum, ConsultcampusperfmonthsumResource> {
	public ConsultcampusperfmonthsumResourceAssembler() {
		super(ConsultcampusperfmonthsumController.class, ConsultcampusperfmonthsumResource.class);
	}
	@Override	public ConsultcampusperfmonthsumResource toResource(Consultcampusperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultcampusperfmonthsumResource instantiateResource(Consultcampusperfmonthsum t) {
		return new ConsultcampusperfmonthsumResource(t);
	}

}