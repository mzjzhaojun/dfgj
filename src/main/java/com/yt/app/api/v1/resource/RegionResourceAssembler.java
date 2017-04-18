package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.RegionController;
import com.yt.app.api.v1.entity.Region;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-11-04 15:40:04
*/

public class RegionResourceAssembler extends ResourceAssemblerSupport<Region, RegionResource> {
	public RegionResourceAssembler() {
		super(RegionController.class, RegionResource.class);
	}
	@Override	public RegionResource toResource(Region t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected RegionResource instantiateResource(Region t) {
		return new RegionResource(t);
	}

}