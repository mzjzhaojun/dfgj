package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.FinancialassignmonthlyincomeController;
import com.yt.app.api.v1.entity.Financialassignmonthlyincome;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:45
*/

public class FinancialassignmonthlyincomeResource extends ResourceSupport {
	private final Financialassignmonthlyincome t;
	public FinancialassignmonthlyincomeResource(Financialassignmonthlyincome entity) {
		this.t = entity;
		this.add(linkTo(FinancialassignmonthlyincomeController.class).withRel("post"));
		this.add(linkTo(methodOn(FinancialassignmonthlyincomeController.class).list(null, null, null)).withRel("list"));
		
}
	public Financialassignmonthlyincome getFinancialassignmonthlyincome() {
		return t;
	}


}