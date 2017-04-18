package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.OtherproductincomeController;
import com.yt.app.api.v1.entity.Otherproductincome;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class OtherproductincomeResource extends ResourceSupport {
	private final Otherproductincome t;
	public OtherproductincomeResource(Otherproductincome entity) {
		this.t = entity;
		this.add(linkTo(OtherproductincomeController.class).withRel("post"));
		this.add(linkTo(methodOn(OtherproductincomeController.class).list(null, null, null)).withRel("list"));
		
}
	public Otherproductincome getOtherproductincome() {
		return t;
	}


}