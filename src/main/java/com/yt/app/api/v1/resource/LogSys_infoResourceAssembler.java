package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.LogSys_infoController;
import com.yt.app.api.v1.entity.LogSys_info;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class LogSys_infoResourceAssembler extends ResourceAssemblerSupport<LogSys_info, LogSys_infoResource> {
	public LogSys_infoResourceAssembler() {
		super(LogSys_infoController.class, LogSys_infoResource.class);
	}
	@Override	public LogSys_infoResource toResource(LogSys_info t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected LogSys_infoResource instantiateResource(LogSys_info t) {
		return new LogSys_infoResource(t);
	}

}