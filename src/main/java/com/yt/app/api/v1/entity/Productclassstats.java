package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class Productclassstats implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	Long productid;
	Integer classcount;
	Integer validclasses;

	public Productclassstats() {
	}

	public Productclassstats(Long id, Integer version, Long campusid, Long productid, Integer classcount, Integer validclasses) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.productid = productid;
		this.classcount = classcount;
		this.validclasses = validclasses;
	}
}