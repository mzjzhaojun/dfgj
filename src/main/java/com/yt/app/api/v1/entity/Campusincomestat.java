package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */
@Getter
@Setter
public class Campusincomestat implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	java.util.Date statlocaldate;
	Long customerid;
	Long campusid;
	String campusname;
	String campusshortname;
	Long branchid;
	String branchname;
	String branchshortname;
	Long regionid;
	String regionname;
	String regionshortname;
	Long hqid;
	String hqname;
	String hqshortname;
	java.util.Date campusdeliverdate;
	Integer campusage;
	String jobproperty;
	Integer incometype;
	String incometypename;
	Integer producttype;
	String productname;
	String grade;
	String gradename;
	String subjecttype;
	String subjecttypename;
	Object amount;
	Object duration;
	Object income;

	public Campusincomestat() {
	}

	public Campusincomestat(Long id, Integer version, java.util.Date statlocaldate, Long customerid, Long campusid, String campusname,
			String campusshortname, Long branchid, String branchname, String branchshortname, Long regionid, String regionname,
			String regionshortname, Long hqid, String hqname, String hqshortname, java.util.Date campusdeliverdate, Integer campusage,
			String jobproperty, Integer incometype, String incometypename, Integer producttype, String productname, String grade, String gradename,
			String subjecttype, String subjecttypename, Object amount, Object duration, Object income) {
		this.id = id;
		this.version = version;
		this.statlocaldate = statlocaldate;
		this.customerid = customerid;
		this.campusid = campusid;
		this.campusname = campusname;
		this.campusshortname = campusshortname;
		this.branchid = branchid;
		this.branchname = branchname;
		this.branchshortname = branchshortname;
		this.regionid = regionid;
		this.regionname = regionname;
		this.regionshortname = regionshortname;
		this.hqid = hqid;
		this.hqname = hqname;
		this.hqshortname = hqshortname;
		this.campusdeliverdate = campusdeliverdate;
		this.campusage = campusage;
		this.jobproperty = jobproperty;
		this.incometype = incometype;
		this.incometypename = incometypename;
		this.producttype = producttype;
		this.productname = productname;
		this.grade = grade;
		this.gradename = gradename;
		this.subjecttype = subjecttype;
		this.subjecttypename = subjecttypename;
		this.amount = amount;
		this.duration = duration;
		this.income = income;
	}
}