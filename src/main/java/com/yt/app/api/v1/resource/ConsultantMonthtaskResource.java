package com.yt.app.api.v1.resource;


import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.ConsultantMonthtaskController;
import com.yt.app.api.v1.entity.ConsultantMonthtask;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/

public class ConsultantMonthtaskResource extends ResourceSupport {
	private final ConsultantMonthtask t;
	public ConsultantMonthtaskResource(ConsultantMonthtask entity) {
this.t = entity;
this.add(linkTo(ConsultantMonthtaskController.class).withRel("post"));
this.add(linkTo(methodOn(ConsultantMonthtaskController.class).list(null, null, null)).withRel("list"));

}
	public ConsultantMonthtask getConsultantMonthtask() {
return t;
	}


}