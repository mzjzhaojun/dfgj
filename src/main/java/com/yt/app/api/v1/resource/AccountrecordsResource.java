package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountrecordsController;
import com.yt.app.api.v1.entity.Accountrecords;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

public class AccountrecordsResource extends ResourceSupport {
	private final Accountrecords t;
	public AccountrecordsResource(Accountrecords entity) {
		this.t = entity;
		this.add(linkTo(AccountrecordsController.class).withRel("post"));
		this.add(linkTo(methodOn(AccountrecordsController.class).list(null, null, null)).withRel("list"));
		
}
	public Accountrecords getAccountrecords() {
		return t;
	}


}