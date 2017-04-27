package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */
@Getter
@Setter
public class Orderdailyinfo implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long customerid;
	Long orderid;
	Long consultantid;
	java.util.Date ordertime;
	Object realamount;

	public Orderdailyinfo() {
	}

	public Orderdailyinfo(Long id, Integer version, Long customerid, Long orderid, Long consultantid, java.util.Date ordertime, Object realamount) {
		this.id = id;
		this.version = version;
		this.customerid = customerid;
		this.orderid = orderid;
		this.consultantid = consultantid;
		this.ordertime = ordertime;
		this.realamount = realamount;
	}
}