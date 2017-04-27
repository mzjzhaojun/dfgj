package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.AssetconfirmsController;
import com.yt.app.api.v1.entity.Assetconfirms;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class AssetconfirmsResourceAssembler extends ResourceAssemblerSupport<Assetconfirms, AssetconfirmsResource> {
	public AssetconfirmsResourceAssembler() {
super(AssetconfirmsController.class, AssetconfirmsResource.class);
	}
	@Override	public AssetconfirmsResource toResource(Assetconfirms t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected AssetconfirmsResource instantiateResource(Assetconfirms t) {
return new AssetconfirmsResource(t);
	}

}