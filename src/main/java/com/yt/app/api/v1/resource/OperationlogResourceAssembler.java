package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OperationlogController;
import com.yt.app.api.v1.entity.Operationlog;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public class OperationlogResourceAssembler extends ResourceAssemblerSupport<Operationlog, OperationlogResource> {
	public OperationlogResourceAssembler() {
		super(OperationlogController.class, OperationlogResource.class);
	}

	@Override
	public OperationlogResource toResource(Operationlog t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected OperationlogResource instantiateResource(Operationlog t) {
		return new OperationlogResource(t);
	}

}