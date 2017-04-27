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
public class Customertransferresources implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long orgid;
	String orgname;
	String orgtype;
	Long customerid;
	java.util.Date transfertime;
	String transfermemo;
	Long transferorid;
	String transferorname;
	Long transferorjobid;
	String transferorjobname;
	Long toorgid;
	String toorgname;
	String toorgtype;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;

	public Customertransferresources() {
	}

	public Customertransferresources(Long id, Integer version, Long orgid, String orgname, String orgtype, Long customerid,
			java.util.Date transfertime, String transfermemo, Long transferorid, String transferorname, Long transferorjobid,
			String transferorjobname, Long toorgid, String toorgname, String toorgtype, Long creatorid, String creatorname, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.orgid = orgid;
		this.orgname = orgname;
		this.orgtype = orgtype;
		this.customerid = customerid;
		this.transfertime = transfertime;
		this.transfermemo = transfermemo;
		this.transferorid = transferorid;
		this.transferorname = transferorname;
		this.transferorjobid = transferorjobid;
		this.transferorjobname = transferorjobname;
		this.toorgid = toorgid;
		this.toorgname = toorgname;
		this.toorgtype = toorgtype;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
	}
}