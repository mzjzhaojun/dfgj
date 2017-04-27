package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.FileController;
import com.yt.app.modul.File;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-11-24 15:01:43
 */

public class FileResourceAssembler extends ResourceAssemblerSupport<File, FileResource> {
	public FileResourceAssembler() {
		super(FileController.class, FileResource.class);
	}

	@Override
	public FileResource toResource(File t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected FileResource instantiateResource(File t) {
		return new FileResource(t);
	}

}