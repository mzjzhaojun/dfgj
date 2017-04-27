package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
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
	String parentcode;
	String parentname;
	String customercode;
	String customername;
	String customerlevel;
	String customerstatus;
	String studentstatus;
	Integer isoneparent;
	String describes;
	java.util.Date birthdays;
	String gender;
	String email;
	String idtype;
	String idnumber;
	String viptype;
	String viplevel;
	String entrancegrade;
	String grade;
	String subjecttype;
	String studenttype;
	String contacttype;
	String sourcemaintype;
	String sourcesubtype;
	String sourcesystem;
	Long schoolid;
	String schoolname;
	Integer isstudyagain;
	java.util.Date firstsigntime;
	Long firstsignerid;
	String firstsignername;
	String invalidreason;
	String schoolyear;
	Integer referralcount;
	Long referralstaffid;
	String referralstaffname;
	Long referralstaffjobid;
	String referralstaffjobname;
	String referralstaffoacode;
	Long referralcustomerid;
	String referralcustomercode;
	String referralcustomername;
	String purchaseintention;
	Integer locked;
	String lockmemo;
	Integer graduated;
	String graduateyear;
	Long creatorid;
	Long creatorname;
	String creatoroacode;
	Long creatorjobid;
	String creatorjobname;
	String creatorjobtype;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
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
	String followstage;
	java.util.Date followtime;
	Integer followedcount;
	Integer followedcountofthismonth;
	java.util.Date nextfollowtime;
	java.util.Date planverifytime;
	java.util.Date plansigntime;
	java.util.Date verifytime;
	Integer verifiedcount;
	java.util.Date visittime;
	Integer visitedcount;
	Integer visitedcountofthismonth;
	java.util.Date nextvisittime;
	Object accountmoney;
	Object accountdiscountrate;
	Object accountdiscountbase;
	java.util.Date accountnewsigntime;
	Object accountnewsignmoney;
	java.util.Date accountrenewsigntime;
	Object accountrenewsignmoney;
	java.util.Date accountchargetime;
	Object accountchargemoney;
	java.util.Date accountrefundtime;
	Object accountrefundmoney;
	Object accounttransferedinmoney;
	java.util.Date accounttransferintime;
	Object accounttransferedoutmoney;
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
	java.util.Date ordertime;
	java.util.Date debooktime;
	java.util.Date assigntime;
	java.util.Date starttime;
	java.util.Date starttimeofonetoone;
	java.util.Date starttimeofclass;
	java.util.Date confirmtime;
	java.util.Date confirmtimeofonetoone;
	java.util.Date confirmtimeofclass;
	Integer confirmedsubjectsofrecent;
	Object confirmedhoursofthismonth;
	java.util.Date allocateconsultanttime;
	Integer allocateteachercount;
	Integer hasexpense;
	java.util.Date expensetime;
	Object expensefee;
	java.util.Date completetime;
	java.util.Date servicecreatetime;
	java.util.Date servicemodifytime;
	String customersearchcontent;
	String parentsearchcontent;

	public Customer() {
	}

	public Customer(Long id, Integer version, Long campusid, String campusname, Long parentid, String parentcode, String parentname,
			String customercode, String customername, String customerlevel, String customerstatus, String studentstatus, Integer isoneparent,
			String describes, java.util.Date birthdays, String gender, String email, String idtype, String idnumber, String viptype, String viplevel,
			String entrancegrade, String grade, String subjecttype, String studenttype, String contacttype, String sourcemaintype,
			String sourcesubtype, String sourcesystem, Long schoolid, String schoolname, Integer isstudyagain, java.util.Date firstsigntime,
			Long firstsignerid, String firstsignername, String invalidreason, String schoolyear, Integer referralcount, Long referralstaffid,
			String referralstaffname, Long referralstaffjobid, String referralstaffjobname, String referralstaffoacode, Long referralcustomerid,
			String referralcustomercode, String referralcustomername, String purchaseintention, Integer locked, String lockmemo, Integer graduated,
			String graduateyear, Long creatorid, Long creatorname, String creatoroacode, Long creatorjobid, String creatorjobname,
			String creatorjobtype, java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime, Long consultantid,
			String consultantname, String consultantoacode, Long consultantjobid, Long educatorid, String educatorname, String educatoroacode,
			Long educatorjobid, Long callcenterid, String callcenteroacode, String callcentername, Long callcenterjobid, Long marketingid,
			String marketingname, String marketingoacode, Long marketingjobid, Integer assignteachernum, String parentidtype, String parentidnumber,
			String parentrole, String customerrole, String customerprimaryphonetype, String customerprimaryphonenumber,
			String customersecondaryphonetype, String customersecondaryphonenumber, String parentprimaryphonetype, String parentprimaryphonenumber,
			String parentsecondaryphonetype, String parentsecondaryphonenumber, String followstage, java.util.Date followtime, Integer followedcount,
			Integer followedcountofthismonth, java.util.Date nextfollowtime, java.util.Date planverifytime, java.util.Date plansigntime,
			java.util.Date verifytime, Integer verifiedcount, java.util.Date visittime, Integer visitedcount, Integer visitedcountofthismonth,
			java.util.Date nextvisittime, Object accountmoney, Object accountdiscountrate, Object accountdiscountbase,
			java.util.Date accountnewsigntime, Object accountnewsignmoney, java.util.Date accountrenewsigntime, Object accountrenewsignmoney,
			java.util.Date accountchargetime, Object accountchargemoney, java.util.Date accountrefundtime, Object accountrefundmoney,
			Object accounttransferedinmoney, java.util.Date accounttransferintime, Object accounttransferedoutmoney,
			java.util.Date accounttransferouttime, Object signedmoney, Integer signedcount, Object assetonetooneamount, Object assetclassamount,
			Object assetotheramount, Object assetonetoonemoney, Object assetclassmoney, Object assetothermoney, Object assetonetooneassignedamount,
			Object assetclassassignedamount, Object assetonetooneassignedmoney, Object assetclassassignedmoney, Object assetonetooneconfirmedamount,
			Object assetclassconfirmedamount, Object assetotherconfirmedamount, Object assetonetooneconfirmedmoney, Object assetclassconfirmedmoney,
			Object assetotherconfirmedmoney, Object assetpresentamount, java.util.Date ordertime, java.util.Date debooktime,
			java.util.Date assigntime, java.util.Date starttime, java.util.Date starttimeofonetoone, java.util.Date starttimeofclass,
			java.util.Date confirmtime, java.util.Date confirmtimeofonetoone, java.util.Date confirmtimeofclass, Integer confirmedsubjectsofrecent,
			Object confirmedhoursofthismonth, java.util.Date allocateconsultanttime, Integer allocateteachercount, Integer hasexpense,
			java.util.Date expensetime, Object expensefee, java.util.Date completetime, java.util.Date servicecreatetime,
			java.util.Date servicemodifytime, String customersearchcontent, String parentsearchcontent) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.campusname = campusname;
		this.parentid = parentid;
		this.parentcode = parentcode;
		this.parentname = parentname;
		this.customercode = customercode;
		this.customername = customername;
		this.customerlevel = customerlevel;
		this.customerstatus = customerstatus;
		this.studentstatus = studentstatus;
		this.isoneparent = isoneparent;
		this.describes = describes;
		this.birthdays = birthdays;
		this.gender = gender;
		this.email = email;
		this.idtype = idtype;
		this.idnumber = idnumber;
		this.viptype = viptype;
		this.viplevel = viplevel;
		this.entrancegrade = entrancegrade;
		this.grade = grade;
		this.subjecttype = subjecttype;
		this.studenttype = studenttype;
		this.contacttype = contacttype;
		this.sourcemaintype = sourcemaintype;
		this.sourcesubtype = sourcesubtype;
		this.sourcesystem = sourcesystem;
		this.schoolid = schoolid;
		this.schoolname = schoolname;
		this.isstudyagain = isstudyagain;
		this.firstsigntime = firstsigntime;
		this.firstsignerid = firstsignerid;
		this.firstsignername = firstsignername;
		this.invalidreason = invalidreason;
		this.schoolyear = schoolyear;
		this.referralcount = referralcount;
		this.referralstaffid = referralstaffid;
		this.referralstaffname = referralstaffname;
		this.referralstaffjobid = referralstaffjobid;
		this.referralstaffjobname = referralstaffjobname;
		this.referralstaffoacode = referralstaffoacode;
		this.referralcustomerid = referralcustomerid;
		this.referralcustomercode = referralcustomercode;
		this.referralcustomername = referralcustomername;
		this.purchaseintention = purchaseintention;
		this.locked = locked;
		this.lockmemo = lockmemo;
		this.graduated = graduated;
		this.graduateyear = graduateyear;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.creatoroacode = creatoroacode;
		this.creatorjobid = creatorjobid;
		this.creatorjobname = creatorjobname;
		this.creatorjobtype = creatorjobtype;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
		this.consultantid = consultantid;
		this.consultantname = consultantname;
		this.consultantoacode = consultantoacode;
		this.consultantjobid = consultantjobid;
		this.educatorid = educatorid;
		this.educatorname = educatorname;
		this.educatoroacode = educatoroacode;
		this.educatorjobid = educatorjobid;
		this.callcenterid = callcenterid;
		this.callcenteroacode = callcenteroacode;
		this.callcentername = callcentername;
		this.callcenterjobid = callcenterjobid;
		this.marketingid = marketingid;
		this.marketingname = marketingname;
		this.marketingoacode = marketingoacode;
		this.marketingjobid = marketingjobid;
		this.assignteachernum = assignteachernum;
		this.parentidtype = parentidtype;
		this.parentidnumber = parentidnumber;
		this.parentrole = parentrole;
		this.customerrole = customerrole;
		this.customerprimaryphonetype = customerprimaryphonetype;
		this.customerprimaryphonenumber = customerprimaryphonenumber;
		this.customersecondaryphonetype = customersecondaryphonetype;
		this.customersecondaryphonenumber = customersecondaryphonenumber;
		this.parentprimaryphonetype = parentprimaryphonetype;
		this.parentprimaryphonenumber = parentprimaryphonenumber;
		this.parentsecondaryphonetype = parentsecondaryphonetype;
		this.parentsecondaryphonenumber = parentsecondaryphonenumber;
		this.followstage = followstage;
		this.followtime = followtime;
		this.followedcount = followedcount;
		this.followedcountofthismonth = followedcountofthismonth;
		this.nextfollowtime = nextfollowtime;
		this.planverifytime = planverifytime;
		this.plansigntime = plansigntime;
		this.verifytime = verifytime;
		this.verifiedcount = verifiedcount;
		this.visittime = visittime;
		this.visitedcount = visitedcount;
		this.visitedcountofthismonth = visitedcountofthismonth;
		this.nextvisittime = nextvisittime;
		this.accountmoney = accountmoney;
		this.accountdiscountrate = accountdiscountrate;
		this.accountdiscountbase = accountdiscountbase;
		this.accountnewsigntime = accountnewsigntime;
		this.accountnewsignmoney = accountnewsignmoney;
		this.accountrenewsigntime = accountrenewsigntime;
		this.accountrenewsignmoney = accountrenewsignmoney;
		this.accountchargetime = accountchargetime;
		this.accountchargemoney = accountchargemoney;
		this.accountrefundtime = accountrefundtime;
		this.accountrefundmoney = accountrefundmoney;
		this.accounttransferedinmoney = accounttransferedinmoney;
		this.accounttransferintime = accounttransferintime;
		this.accounttransferedoutmoney = accounttransferedoutmoney;
		this.accounttransferouttime = accounttransferouttime;
		this.signedmoney = signedmoney;
		this.signedcount = signedcount;
		this.assetonetooneamount = assetonetooneamount;
		this.assetclassamount = assetclassamount;
		this.assetotheramount = assetotheramount;
		this.assetonetoonemoney = assetonetoonemoney;
		this.assetclassmoney = assetclassmoney;
		this.assetothermoney = assetothermoney;
		this.assetonetooneassignedamount = assetonetooneassignedamount;
		this.assetclassassignedamount = assetclassassignedamount;
		this.assetonetooneassignedmoney = assetonetooneassignedmoney;
		this.assetclassassignedmoney = assetclassassignedmoney;
		this.assetonetooneconfirmedamount = assetonetooneconfirmedamount;
		this.assetclassconfirmedamount = assetclassconfirmedamount;
		this.assetotherconfirmedamount = assetotherconfirmedamount;
		this.assetonetooneconfirmedmoney = assetonetooneconfirmedmoney;
		this.assetclassconfirmedmoney = assetclassconfirmedmoney;
		this.assetotherconfirmedmoney = assetotherconfirmedmoney;
		this.assetpresentamount = assetpresentamount;
		this.ordertime = ordertime;
		this.debooktime = debooktime;
		this.assigntime = assigntime;
		this.starttime = starttime;
		this.starttimeofonetoone = starttimeofonetoone;
		this.starttimeofclass = starttimeofclass;
		this.confirmtime = confirmtime;
		this.confirmtimeofonetoone = confirmtimeofonetoone;
		this.confirmtimeofclass = confirmtimeofclass;
		this.confirmedsubjectsofrecent = confirmedsubjectsofrecent;
		this.confirmedhoursofthismonth = confirmedhoursofthismonth;
		this.allocateconsultanttime = allocateconsultanttime;
		this.allocateteachercount = allocateteachercount;
		this.hasexpense = hasexpense;
		this.expensetime = expensetime;
		this.expensefee = expensefee;
		this.completetime = completetime;
		this.servicecreatetime = servicecreatetime;
		this.servicemodifytime = servicemodifytime;
		this.customersearchcontent = customersearchcontent;
		this.parentsearchcontent = parentsearchcontent;
	}
}