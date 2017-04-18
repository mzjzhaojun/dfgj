package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.FileController;
import com.yt.app.api.v1.entity.File;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-11-24 15:01:43
*/

public class FileResource extends ResourceSupport {
	private final File t;
	public FileResource(File entity) {
		this.t = entity;
		this.add(linkTo(FileController.class).withRel("post"));
//		this.add(linkTo(methodOn(FileController.class).list(null, null, null)).withRel("list"));
		
}
	public File getFile() {
		return t;
	}


}