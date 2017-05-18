package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yt.app.frame.p.DateTimeUtil;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */
@Getter
@Setter
public class Discounts implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String discountcode;
	String discountname;
	Long discountstatus;
	String discountstatusname;
	java.util.Date applystartdate;
	java.util.Date startdate;
	Long branchid;
	String branchname;
	java.util.Date submittime;
	Long submitterid;
	String submittername;
	Long submitterjobid;
	String submitterjobname;
	Long approverid;
	String approvername;
	Long approverjobid;
	String approverjobname;
	java.util.Date approvetime;
	Long creatorid;
	String creatorname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;

	public Discounts() {
	}

	public Discounts(Long id, Integer version, String discountcode, String discountname, Long discountstatus, java.util.Date applystartdate,
			java.util.Date startdate, Long branchid, String branchname, java.util.Date submittime, Long submitterid, String submittername,
			Long submitterjobid, String submitterjobname, Long approverid, String approvername, Long approverjobid, String approverjobname,
			java.util.Date approvetime, Long creatorid, String creatorname, java.util.Date createtime, Long modifierid, String modifiername,
			java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.discountcode = discountcode;
		this.discountname = discountname;
		this.discountstatus = discountstatus;
		this.applystartdate = applystartdate;
		this.startdate = startdate;
		this.branchid = branchid;
		this.branchname = branchname;
		this.submittime = submittime;
		this.submitterid = submitterid;
		this.submittername = submittername;
		this.submitterjobid = submitterjobid;
		this.submitterjobname = submitterjobname;
		this.approverid = approverid;
		this.approvername = approvername;
		this.approverjobid = approverjobid;
		this.approverjobname = approverjobname;
		this.approvetime = approvetime;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}