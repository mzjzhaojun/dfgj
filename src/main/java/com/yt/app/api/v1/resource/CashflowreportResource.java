package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CashflowreportController;
import com.yt.app.api.v1.entity.Cashflowreport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class CashflowreportResource extends ResourceSupport {
	private final Cashflowreport t;

	public CashflowreportResource(Cashflowreport entity) {
		this.t = entity;
		this.add(linkTo(CashflowreportController.class).withRel("post"));
		this.add(linkTo(methodOn(CashflowreportController.class).list(null, null, null)).withRel("list"));

	}

	public Cashflowreport getCashflowreport() {
		return t;
	}

}