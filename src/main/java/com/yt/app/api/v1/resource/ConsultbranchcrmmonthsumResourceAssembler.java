package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultbranchcrmmonthsumController;
import com.yt.app.api.v1.entity.Consultbranchcrmmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class ConsultbranchcrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Consultbranchcrmmonthsum, ConsultbranchcrmmonthsumResource> {
	public ConsultbranchcrmmonthsumResourceAssembler() {
		super(ConsultbranchcrmmonthsumController.class, ConsultbranchcrmmonthsumResource.class);
	}
	@Override	public ConsultbranchcrmmonthsumResource toResource(Consultbranchcrmmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultbranchcrmmonthsumResource instantiateResource(Consultbranchcrmmonthsum t) {
		return new ConsultbranchcrmmonthsumResource(t);
	}

}