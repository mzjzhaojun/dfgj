package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.TeachgroupcrmmonthsumController;
import com.yt.app.api.v1.entity.Teachgroupcrmmonthsum;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/

public class TeachgroupcrmmonthsumResourceAssembler extends ResourceAssemblerSupport<Teachgroupcrmmonthsum, TeachgroupcrmmonthsumResource> {
	public TeachgroupcrmmonthsumResourceAssembler() {
super(TeachgroupcrmmonthsumController.class, TeachgroupcrmmonthsumResource.class);
	}
	@Override	public TeachgroupcrmmonthsumResource toResource(Teachgroupcrmmonthsum t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected TeachgroupcrmmonthsumResource instantiateResource(Teachgroupcrmmonthsum t) {
return new TeachgroupcrmmonthsumResource(t);
	}

}