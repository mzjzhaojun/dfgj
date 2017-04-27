package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.OtherproductincomeController;
import com.yt.app.api.v1.entity.Otherproductincome;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/

public class OtherproductincomeResourceAssembler extends ResourceAssemblerSupport<Otherproductincome, OtherproductincomeResource> {
	public OtherproductincomeResourceAssembler() {
super(OtherproductincomeController.class, OtherproductincomeResource.class);
	}
	@Override	public OtherproductincomeResource toResource(Otherproductincome t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected OtherproductincomeResource instantiateResource(Otherproductincome t) {
return new OtherproductincomeResource(t);
	}

}