package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.LogSysinfoController;
import com.yt.app.api.v1.entity.LogSysinfo;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */

public class LogSysinfoResourceAssembler extends ResourceAssemblerSupport<LogSysinfo, LogSysinfoResource> {
	public LogSysinfoResourceAssembler() {
		super(LogSysinfoController.class, LogSysinfoResource.class);
	}

	@Override
	public LogSysinfoResource toResource(LogSysinfo t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected LogSysinfoResource instantiateResource(LogSysinfo t) {
		return new LogSysinfoResource(t);
	}

}