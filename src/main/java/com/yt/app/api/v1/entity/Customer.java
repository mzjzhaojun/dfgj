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
 * @createdate 2017-04-27 19:22:18
 */
@Getter
@Setter
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	Long parentid;
	Long parentcode;
	String parentname;
	Long customercode;
	String customername;
	Long customerlevel;
	String customerlevelname;
	Long customerstatus;
	String customerstatusname;
	Long studentstatus;
	Long isoneparent;
	String isoneparentname;
	String describes;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date birthday;
	Long gender;
	String gendername;
	String email;
	Long idtype;
	String idtypename;
	String idnumber;
	Long viptype;
	String viptypename;
	Long viplevel;
	String viplevelname;
	Long entrancegrade;
	String entrancegradename;
	Long grade;
	String gradename;
	Long subjecttype;
	String subjecttypename;
	Long studenttype;
	String studenttypename;
	Long contacttype;
	String contacttypename;
	Long sourcemaintype;
	String sourcemaintypename;
	Long sourcesubtype;
	Long sourcesystem;
	Long schoolid;
	String schoolname;
	Long isstudyagain;
	String isstudyagainname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date firstsigntime;
	Long firstsignerid;
	String firstsignername;
	Long invalidreason;
	String invalidreasonname;
	Long schoolyear;
	String schoolyearname;
	Integer referralcount;
	Long referralstaffid;
	String referralstaffname;
	Long referralstaffjobid;
	String referralstaffjobname;
	String referralstaffoacode;
	Long referralcustomerid;
	String referralcustomercode;
	String referralcustomername;
	Long purchaseintention;
	String purchaseintentionname;
	Integer locked;
	String lockmemo;
	Integer graduated;
	String graduateyear;
	Long creatorid;
	String creatorname;
	String creatoroacode;
	Long creatorjobid;
	String creatorjobname;
	String creatorjobtype;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;
	Long consultantid;
	String consultantname;
	String consultantoacode;
	Long consultantjobid;
	Long educatorid;
	String educatorname;
	String educatoroacode;
	Long educatorjobid;
	Long callcenterid;
	String callcenteroacode;
	String callcentername;
	Long callcenterjobid;
	Long marketingid;
	String marketingname;
	String marketingoacode;
	Long marketingjobid;
	Integer assignteachernum;
	String parentidtype;
	String parentidnumber;
	String parentrole;
	String customerrole;
	String customerprimaryphonetype;
	String customerprimaryphonenumber;
	String customersecondaryphonetype;
	String customersecondaryphonenumber;
	String parentprimaryphonetype;
	String parentprimaryphonenumber;
	String parentsecondaryphonetype;
	String parentsecondaryphonenumber;
	Long followstage;
	String followstagename;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date followtime;
	Integer followedcount;
	Integer followedcountofthismonth;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date nextfollowtime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date planverifytime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date plansigntime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date verifytime;
	Integer verifiedcount;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date visittime;
	Integer visitedcount;
	Integer visitedcountofthismonth;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date nextvisittime;
	Object accountmoney;
	Object accountdiscountrate;
	Object accountdiscountbase;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date accountnewsigntime;
	Object accountnewsignmoney;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date accountrenewsigntime;
	Object accountrenewsignmoney;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date accountchargetime;
	Object accountchargemoney;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date accountrefundtime;
	Object accountrefundmoney;
	Object accounttransferedinmoney;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date accounttransferintime;
	Object accounttransferedoutmoney;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date accounttransferouttime;
	Object signedmoney;
	Integer signedcount;
	Object assetonetooneamount;
	Object assetclassamount;
	Object assetotheramount;
	Object assetonetoonemoney;
	Object assetclassmoney;
	Object assetothermoney;
	Object assetonetooneassignedamount;
	Object assetclassassignedamount;
	Object assetonetooneassignedmoney;
	Object assetclassassignedmoney;
	Object assetonetooneconfirmedamount;
	Object assetclassconfirmedamount;
	Object assetotherconfirmedamount;
	Object assetonetooneconfirmedmoney;
	Object assetclassconfirmedmoney;
	Object assetotherconfirmedmoney;
	Object assetpresentamount;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date ordertime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date debooktime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date assigntime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date starttime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date starttimeofonetoone;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date starttimeofclass;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date confirmtime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date confirmtimeofonetoone;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date confirmtimeofclass;
	Integer confirmedsubjectsofrecent;
	Object confirmedhoursofthismonth;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date allocateconsultanttime;
	Integer allocateteachercount;
	Integer hasexpense;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date expensetime;
	Object expensefee;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date completetime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date servicecreatetime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date servicemodifytime;
	String customersearchcontent;
	String parentsearchcontent;

	public Customer() {
	}

}