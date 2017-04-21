package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.ConsultantMonthtaskController;
import com.yt.app.api.v1.entity.ConsultantMonthtask;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:25
*/

public class ConsultantMonthtaskResourceAssembler extends ResourceAssemblerSupport<ConsultantMonthtask, ConsultantMonthtaskResource> {
	public ConsultantMonthtaskResourceAssembler() {
		super(ConsultantMonthtaskController.class, ConsultantMonthtaskResource.class);
	}
	@Override	public ConsultantMonthtaskResource toResource(ConsultantMonthtask t) {
		return createResourceWithId(t.getId(), t);
	}
	@Override
	protected ConsultantMonthtaskResource instantiateResource(ConsultantMonthtask t) {
		return new ConsultantMonthtaskResource(t);
	}

}