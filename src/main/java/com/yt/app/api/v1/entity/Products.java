package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yt.app.util.DateTimeUtil;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class Products implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long rdorgid;
	String rdorgname;
	String productcode;
	String productname;
	String productmemo;
	Long productstatus;
	String productstatusname;
	String productversion;
	Object productprice;
	Object productcost;
	String productunit;
	Object targetprice;
	String targetpricememo;
	Long catalog;
	String catalogname;
	Long subject;
	String subjectname;
	Long grade;
	String gradename;
	Long year;
	String yearname;
	Long season;
	String seasonname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date startdate;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date enddate;
	Long partnerid;
	Object partnerratio;
	String partnername;
	Long specialallowed;
	String specialallowedname;
	Long tunlandallowed;
	String tunlandallowedname;
	Long presentallowed;
	String presentallowedname;
	Long promotionallowed;
	String promotionallowedname;
	Object promotionquota;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date confirmstartdate;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date confirmenddate;
	String confirmmode;
	Integer confirmstaging;
	Long submitterid;
	String submittername;
	Long submitterjobid;
	String submitterjobname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date submittime;
	Long approverid;
	String approvername;
	Long approverjobid;
	String approverjobname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date approvetime;
	Long creatorid;
	String creatorname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;

	public Products() {
	}

}