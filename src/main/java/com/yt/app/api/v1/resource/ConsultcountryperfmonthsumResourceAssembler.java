package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultcountryperfmonthsumController;
import com.yt.app.api.v1.entity.Consultcountryperfmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:27
*/

public class ConsultcountryperfmonthsumResourceAssembler extends ResourceAssemblerSupport<Consultcountryperfmonthsum, ConsultcountryperfmonthsumResource> {
	public ConsultcountryperfmonthsumResourceAssembler() {
		super(ConsultcountryperfmonthsumController.class, ConsultcountryperfmonthsumResource.class);
	}
	@Override	public ConsultcountryperfmonthsumResource toResource(Consultcountryperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultcountryperfmonthsumResource instantiateResource(Consultcountryperfmonthsum t) {
		return new ConsultcountryperfmonthsumResource(t);
	}

}