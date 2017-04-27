package com.yt.app.api.v1.resource;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.yt.app.api.v1.controller.EmailMessagesController;
import com.yt.app.api.v1.entity.EmailMessages;



/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/

public class EmailMessagesResourceAssembler extends ResourceAssemblerSupport<EmailMessages, EmailMessagesResource> {
	public EmailMessagesResourceAssembler() {
super(EmailMessagesController.class, EmailMessagesResource.class);
	}
	@Override	public EmailMessagesResource toResource(EmailMessages t) {
return createResourceWithId(t.getId(), t);
	}
	@Override
	protected EmailMessagesResource instantiateResource(EmailMessages t) {
return new EmailMessagesResource(t);
	}

}