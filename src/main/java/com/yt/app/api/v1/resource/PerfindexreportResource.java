package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PerfindexreportController;
import com.yt.app.api.v1.entity.Perfindexreport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class PerfindexreportResource extends ResourceSupport {
	private final Perfindexreport t;
	public PerfindexreportResource(Perfindexreport entity) {
		this.t = entity;
		this.add(linkTo(PerfindexreportController.class).withRel("post"));
		this.add(linkTo(methodOn(PerfindexreportController.class).list(null, null, null)).withRel("list"));
		
}
	public Perfindexreport getPerfindexreport() {
		return t;
	}


}