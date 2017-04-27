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
public class Customerrelations implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long customerid;
	Long staffid;
	String staffname;
	Long staffjobid;
	String staffjobname;
	Long staffjoborgid;
	String staffjoborgname;
	String relationtype;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;

	public Customerrelations() {
	}

	public Customerrelations(Long id, Integer version, Long customerid, Long staffid, String staffname, Long staffjobid, String staffjobname,
			Long staffjoborgid, String staffjoborgname, String relationtype, Long creatorid, String creatorname, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.customerid = customerid;
		this.staffid = staffid;
		this.staffname = staffname;
		this.staffjobid = staffjobid;
		this.staffjobname = staffjobname;
		this.staffjoborgid = staffjoborgid;
		this.staffjoborgname = staffjoborgname;
		this.relationtype = relationtype;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
	}
}