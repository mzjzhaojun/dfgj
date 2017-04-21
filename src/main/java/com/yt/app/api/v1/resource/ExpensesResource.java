package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ExpensesController;
import com.yt.app.api.v1.entity.Expenses;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:45
*/

public class ExpensesResource extends ResourceSupport {
	private final Expenses t;
	public ExpensesResource(Expenses entity) {
		this.t = entity;
		this.add(linkTo(ExpensesController.class).withRel("post"));
		this.add(linkTo(methodOn(ExpensesController.class).list(null, null, null)).withRel("list"));
		
}
	public Expenses getExpenses() {
		return t;
	}


}