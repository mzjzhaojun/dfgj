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
public class Repertories implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long productname;
	Integer totalquantity;
	Integer usedquantity;
	java.util.Date createtime;

	public Repertories() {
	}

	public Repertories(Long id, Integer version, Long productname, Integer totalquantity, Integer usedquantity, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.productname = productname;
		this.totalquantity = totalquantity;
		this.usedquantity = usedquantity;
		this.createtime = createtime;
	}
}