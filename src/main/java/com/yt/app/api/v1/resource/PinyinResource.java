package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.PinyinController;
import com.yt.app.api.v1.entity.Pinyin;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

public class PinyinResource extends ResourceSupport {
	private final Pinyin t;
	public PinyinResource(Pinyin entity) {
		this.t = entity;
		this.add(linkTo(PinyinController.class).withRel("post"));
		this.add(linkTo(methodOn(PinyinController.class).list(null, null, null)).withRel("list"));
		
}
	public Pinyin getPinyin() {
		return t;
	}


}