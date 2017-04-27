package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */
@Getter
@Setter
public class Discountitems implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long discountid;
	Object discountvalue;
	Object discountstandard;

	public Discountitems() {
	}

	public Discountitems(Long id, Integer version, Long discountid, Object discountvalue, Object discountstandard) {
		this.id = id;
		this.version = version;
		this.discountid = discountid;
		this.discountvalue = discountvalue;
		this.discountstandard = discountstandard;
	}
}