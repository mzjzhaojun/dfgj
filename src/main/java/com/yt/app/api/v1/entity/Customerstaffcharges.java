package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */
@Getter
@Setter
public class Customerstaffcharges implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long customerid;
	Long staffid;
	java.util.Date statlocaldate;
	Long campusid;
	String relationtype;
	Object newchargeamount;
	Object renewamount;
	Object refundamount;

	public Customerstaffcharges() {
	}

	public Customerstaffcharges(Long id, Integer version, Long customerid, Long staffid, java.util.Date statlocaldate, Long campusid,
			String relationtype, Object newchargeamount, Object renewamount, Object refundamount) {
		this.id = id;
		this.version = version;
		this.customerid = customerid;
		this.staffid = staffid;
		this.statlocaldate = statlocaldate;
		this.campusid = campusid;
		this.relationtype = relationtype;
		this.newchargeamount = newchargeamount;
		this.renewamount = renewamount;
		this.refundamount = refundamount;
	}
}