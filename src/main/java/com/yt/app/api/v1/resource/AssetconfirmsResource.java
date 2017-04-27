package com.yt.app.api.v1.resource;

import org.springframework.hateoas.ResourceSupport;
import com.yt.app.api.v1.controller.AssetconfirmsController;
import com.yt.app.api.v1.entity.Assetconfirms;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */

public class AssetconfirmsResource extends ResourceSupport {
	private final Assetconfirms t;

	public AssetconfirmsResource(Assetconfirms entity) {
		this.t = entity;
		this.add(linkTo(AssetconfirmsController.class).withRel("post"));
		this.add(linkTo(methodOn(AssetconfirmsController.class).list(null, null, null)).withRel("list"));

	}

	public Assetconfirms getAssetconfirms() {
		return t;
	}

}