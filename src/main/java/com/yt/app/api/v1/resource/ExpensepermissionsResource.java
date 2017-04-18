package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ExpensepermissionsController;
import com.yt.app.api.v1.entity.Expensepermissions;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

public class ExpensepermissionsResource extends ResourceSupport {
	private final Expensepermissions t;
	public ExpensepermissionsResource(Expensepermissions entity) {
		this.t = entity;
		this.add(linkTo(ExpensepermissionsController.class).withRel("post"));
		this.add(linkTo(methodOn(ExpensepermissionsController.class).list(null, null, null)).withRel("list"));
		
}
	public Expensepermissions getExpensepermissions() {
		return t;
	}


}