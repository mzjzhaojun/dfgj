package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AccountrecordsController;
import com.yt.app.api.v1.entity.Accountrecords;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:45
 */

public class AccountrecordsResourceAssembler extends ResourceAssemblerSupport<Accountrecords, AccountrecordsResource> {
	public AccountrecordsResourceAssembler() {
		super(AccountrecordsController.class, AccountrecordsResource.class);
	}

	@Override
	public AccountrecordsResource toResource(Accountrecords t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected AccountrecordsResource instantiateResource(Accountrecords t) {
		return new AccountrecordsResource(t);
	}

}