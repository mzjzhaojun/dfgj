package com.yt.app.api.v1.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.CampusMonthtaskController;
import com.yt.app.api.v1.entity.CampusMonthtask;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public class CampusMonthtaskResourceAssembler extends ResourceAssemblerSupport<CampusMonthtask, CampusMonthtaskResource> {
	public CampusMonthtaskResourceAssembler() {
		super(CampusMonthtaskController.class, CampusMonthtaskResource.class);
	}

	@Override
	public CampusMonthtaskResource toResource(CampusMonthtask t) {
		return createResourceWithId(t.getId(), t);
	}

	@Override
	protected CampusMonthtaskResource instantiateResource(CampusMonthtask t) {
		return new CampusMonthtaskResource(t);
	}

}