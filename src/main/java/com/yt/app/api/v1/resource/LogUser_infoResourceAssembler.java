package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.LogUser_infoController;
import com.yt.app.api.v1.entity.LogUser_info;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class LogUser_infoResourceAssembler extends ResourceAssemblerSupport<LogUser_info, LogUser_infoResource> {
	public LogUser_infoResourceAssembler() {
		super(LogUser_infoController.class, LogUser_infoResource.class);
	}
	@Override	public LogUser_infoResource toResource(LogUser_info t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected LogUser_infoResource instantiateResource(LogUser_info t) {
		return new LogUser_infoResource(t);
	}

}