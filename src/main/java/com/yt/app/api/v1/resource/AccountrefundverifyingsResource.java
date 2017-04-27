package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AccountrefundverifyingsController;
import com.yt.app.api.v1.entity.Accountrefundverifyings;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class AccountrefundverifyingsResource extends ResourceSupport {
	private final Accountrefundverifyings t;
	public AccountrefundverifyingsResource(Accountrefundverifyings entity) {
this.t = entity;
this.add(linkTo(AccountrefundverifyingsController.class).withRel("post"));
this.add(linkTo(methodOn(AccountrefundverifyingsController.class).list(null, null, null)).withRel("list"));

}
	public Accountrefundverifyings getAccountrefundverifyings() {
return t;
	}


}