package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultbranchperfmonthsumController;
import com.yt.app.api.v1.entity.Consultbranchperfmonthsum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class ConsultbranchperfmonthsumResourceAssembler extends
		ResourceAssemblerSupport<Consultbranchperfmonthsum, ConsultbranchperfmonthsumResource> {
	public ConsultbranchperfmonthsumResourceAssembler() {
		super(ConsultbranchperfmonthsumController.class, ConsultbranchperfmonthsumResource.class);
	}

	@Override
	public ConsultbranchperfmonthsumResource toResource(Consultbranchperfmonthsum t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected ConsultbranchperfmonthsumResource instantiateResource(Consultbranchperfmonthsum t) {
		return new ConsultbranchperfmonthsumResource(t);
	}

}