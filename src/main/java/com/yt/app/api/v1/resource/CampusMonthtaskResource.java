package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.CampusMonthtaskController;
import com.yt.app.api.v1.entity.CampusMonthtask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:20
*/

public class CampusMonthtaskResource extends ResourceSupport {
	private final CampusMonthtask t;
	public CampusMonthtaskResource(CampusMonthtask entity) {
		this.t = entity;
		this.add(linkTo(CampusMonthtaskController.class).withRel("post"));
		this.add(linkTo(methodOn(CampusMonthtaskController.class).list(null, null, null)).withRel("list"));
		
}
	public CampusMonthtask getCampusMonthtask() {
		return t;
	}


}