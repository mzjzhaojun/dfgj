package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OtherproductincomeweeklyController;
import com.yt.app.api.v1.entity.Otherproductincomeweekly;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class OtherproductincomeweeklyResourceAssembler extends ResourceAssemblerSupport<Otherproductincomeweekly, OtherproductincomeweeklyResource> {
	public OtherproductincomeweeklyResourceAssembler() {
		super(OtherproductincomeweeklyController.class, OtherproductincomeweeklyResource.class);
	}
	@Override	public OtherproductincomeweeklyResource toResource(Otherproductincomeweekly t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OtherproductincomeweeklyResource instantiateResource(Otherproductincomeweekly t) {
		return new OtherproductincomeweeklyResource(t);
	}

}