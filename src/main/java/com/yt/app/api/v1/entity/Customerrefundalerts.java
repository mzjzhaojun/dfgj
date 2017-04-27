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
public class Customerrefundalerts implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	java.util.Date alerttime;
	String alertstatus;
	String alertreason;
	String alertreasonname;
	Long operatorid;
	String operatorname;
	Long operatorjobid;
	String operatorjobname;
	Long customerid;

	public Customerrefundalerts() {
	}

	public Customerrefundalerts(Long id, Integer version, java.util.Date alerttime, String alertstatus, String alertreason, String alertreasonname,
			Long operatorid, String operatorname, Long operatorjobid, String operatorjobname, Long customerid) {
		this.id = id;
		this.version = version;
		this.alerttime = alerttime;
		this.alertstatus = alertstatus;
		this.alertreason = alertreason;
		this.alertreasonname = alertreasonname;
		this.operatorid = operatorid;
		this.operatorname = operatorname;
		this.operatorjobid = operatorjobid;
		this.operatorjobname = operatorjobname;
		this.customerid = customerid;
	}
}