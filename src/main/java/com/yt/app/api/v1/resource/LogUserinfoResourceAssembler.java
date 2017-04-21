package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.LogUserinfoController;
import com.yt.app.api.v1.entity.LogUserinfo;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:47
*/

public class LogUserinfoResourceAssembler extends ResourceAssemblerSupport<LogUserinfo, LogUserinfoResource> {
	public LogUserinfoResourceAssembler() {
		super(LogUserinfoController.class, LogUserinfoResource.class);
	}
	@Override	public LogUserinfoResource toResource(LogUserinfo t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected LogUserinfoResource instantiateResource(LogUserinfo t) {
		return new LogUserinfoResource(t);
	}

}