package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EducatecampusperfdaysumController;
import com.yt.app.api.v1.entity.Educatecampusperfdaysum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:40
*/

public class EducatecampusperfdaysumResourceAssembler extends ResourceAssemblerSupport<Educatecampusperfdaysum, EducatecampusperfdaysumResource> {
	public EducatecampusperfdaysumResourceAssembler() {
		super(EducatecampusperfdaysumController.class, EducatecampusperfdaysumResource.class);
	}
	@Override	public EducatecampusperfdaysumResource toResource(Educatecampusperfdaysum t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EducatecampusperfdaysumResource instantiateResource(Educatecampusperfdaysum t) {
		return new EducatecampusperfdaysumResource(t);
	}

}