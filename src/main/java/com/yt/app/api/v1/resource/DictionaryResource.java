package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.DictionaryController;
import com.yt.app.api.v1.entity.Dictionary;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-14 10:16:01
*/

public class DictionaryResource extends ResourceSupport {
	private final Dictionary t;
	public DictionaryResource(Dictionary entity) {
		this.t = entity;
		this.add(linkTo(DictionaryController.class).withRel("post"));
		this.add(linkTo(methodOn(DictionaryController.class).list(null, null, null)).withRel("list"));
		
}
	public Dictionary getDictionary() {
		return t;
	}


}