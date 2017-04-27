package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CountryCodeController;
import com.yt.app.api.v1.entity.CountryCode;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CountryCodeResourceAssembler extends ResourceAssemblerSupport<CountryCode, CountryCodeResource> {
	public CountryCodeResourceAssembler() {
		super(CountryCodeController.class, CountryCodeResource.class);
	}

	@Override
	public CountryCodeResource toResource(CountryCode t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CountryCodeResource instantiateResource(CountryCode t) {
		return new CountryCodeResource(t);
	}

}