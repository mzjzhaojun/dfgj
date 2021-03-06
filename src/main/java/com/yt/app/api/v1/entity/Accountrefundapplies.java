package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */
@Getter
@Setter
public class Accountrefundapplies implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	Long customerid;
	String customercode;
	String customername;
	Long accountid;
	String accountcode;
	String applyno;
	String applystatus;
	String applymemotype;
	String applymemo;
	java.util.Date applytime;
	Long applierid;
	String appliername;
	Long applierjobid;
	String applierjobname;
	String applierjobtype;
	String processstatus;
	java.util.Date processtime;
	String processmemo;
	String refundtype;
	Integer isperiodrefund;
	Integer isextrarefund;
	Object applyrefundmoney;
	Object oughtrefundmoney;
	Object realrefundmoney;
	Object consumptionvalue;
	Object reallowancemoney;
	String extrarefundtype;
	Object extrarefundmoney;
	Object compensatemoney;
	Long thatdiscountid;
	String thatdiscountcode;
	Object thatdiscountbase;
	Object thatdiscountrate;
	Object thataccountvalue;
	Object thataccountmoney;
	Long thisdiscountid;
	String thisdiscountcode;
	Object thisdiscountbase;
	Object thisdiscountrate;
	Object thisaccountvalue;
	Object thisaccountmoney;
	String drawer;
	Long consultantid;
	String consultantname;
	Long consultantjobid;
	Long educatorid;
	String educatorname;
	Long educatorjobid;
	Long submitterid;
	String submittername;
	Long submitterjobid;
	String submitterjobname;
	String submitterjobtype;
	java.util.Date submittime;
	Long approverid;
	String approvername;
	Long approverjobid;
	String approverjobname;
	java.util.Date approvetime;
	Long verifierid;
	String verifiername;
	Long verifierjobid;
	String verifierjobname;
	String verifystatus;
	java.util.Date verifytime;
	Long checkerid;
	String checkername;
	Long checkerjobid;
	String checkerjobname;
	String checkstatus;
	java.util.Date checktime;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;
	Long tenantcode;
	String issyn;
	java.util.Date syntime;

	public Accountrefundapplies() {
	}

	public Accountrefundapplies(Long id, Integer version, Long campusid, String campusname, Long customerid, String customercode,
			String customername, Long accountid, String accountcode, String applyno, String applystatus, String applymemotype, String applymemo,
			java.util.Date applytime, Long applierid, String appliername, Long applierjobid, String applierjobname, String applierjobtype,
			String processstatus, java.util.Date processtime, String processmemo, String refundtype, Integer isperiodrefund, Integer isextrarefund,
			Object applyrefundmoney, Object oughtrefundmoney, Object realrefundmoney, Object consumptionvalue, Object reallowancemoney,
			String extrarefundtype, Object extrarefundmoney, Object compensatemoney, Long thatdiscountid, String thatdiscountcode,
			Object thatdiscountbase, Object thatdiscountrate, Object thataccountvalue, Object thataccountmoney, Long thisdiscountid,
			String thisdiscountcode, Object thisdiscountbase, Object thisdiscountrate, Object thisaccountvalue, Object thisaccountmoney,
			String drawer, Long consultantid, String consultantname, Long consultantjobid, Long educatorid, String educatorname, Long educatorjobid,
			Long submitterid, String submittername, Long submitterjobid, String submitterjobname, String submitterjobtype, java.util.Date submittime,
			Long approverid, String approvername, Long approverjobid, String approverjobname, java.util.Date approvetime, Long verifierid,
			String verifiername, Long verifierjobid, String verifierjobname, String verifystatus, java.util.Date verifytime, Long checkerid,
			String checkername, Long checkerjobid, String checkerjobname, String checkstatus, java.util.Date checktime, Long creatorid,
			String creatorname, java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime, Long tenantcode,
			String issyn, java.util.Date syntime) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.campusname = campusname;
		this.customerid = customerid;
		this.customercode = customercode;
		this.customername = customername;
		this.accountid = accountid;
		this.accountcode = accountcode;
		this.applyno = applyno;
		this.applystatus = applystatus;
		this.applymemotype = applymemotype;
		this.applymemo = applymemo;
		this.applytime = applytime;
		this.applierid = applierid;
		this.appliername = appliername;
		this.applierjobid = applierjobid;
		this.applierjobname = applierjobname;
		this.applierjobtype = applierjobtype;
		this.processstatus = processstatus;
		this.processtime = processtime;
		this.processmemo = processmemo;
		this.refundtype = refundtype;
		this.isperiodrefund = isperiodrefund;
		this.isextrarefund = isextrarefund;
		this.applyrefundmoney = applyrefundmoney;
		this.oughtrefundmoney = oughtrefundmoney;
		this.realrefundmoney = realrefundmoney;
		this.consumptionvalue = consumptionvalue;
		this.reallowancemoney = reallowancemoney;
		this.extrarefundtype = extrarefundtype;
		this.extrarefundmoney = extrarefundmoney;
		this.compensatemoney = compensatemoney;
		this.thatdiscountid = thatdiscountid;
		this.thatdiscountcode = thatdiscountcode;
		this.thatdiscountbase = thatdiscountbase;
		this.thatdiscountrate = thatdiscountrate;
		this.thataccountvalue = thataccountvalue;
		this.thataccountmoney = thataccountmoney;
		this.thisdiscountid = thisdiscountid;
		this.thisdiscountcode = thisdiscountcode;
		this.thisdiscountbase = thisdiscountbase;
		this.thisdiscountrate = thisdiscountrate;
		this.thisaccountvalue = thisaccountvalue;
		this.thisaccountmoney = thisaccountmoney;
		this.drawer = drawer;
		this.consultantid = consultantid;
		this.consultantname = consultantname;
		this.consultantjobid = consultantjobid;
		this.educatorid = educatorid;
		this.educatorname = educatorname;
		this.educatorjobid = educatorjobid;
		this.submitterid = submitterid;
		this.submittername = submittername;
		this.submitterjobid = submitterjobid;
		this.submitterjobname = submitterjobname;
		this.submitterjobtype = submitterjobtype;
		this.submittime = submittime;
		this.approverid = approverid;
		this.approvername = approvername;
		this.approverjobid = approverjobid;
		this.approverjobname = approverjobname;
		this.approvetime = approvetime;
		this.verifierid = verifierid;
		this.verifiername = verifiername;
		this.verifierjobid = verifierjobid;
		this.verifierjobname = verifierjobname;
		this.verifystatus = verifystatus;
		this.verifytime = verifytime;
		this.checkerid = checkerid;
		this.checkername = checkername;
		this.checkerjobid = checkerjobid;
		this.checkerjobname = checkerjobname;
		this.checkstatus = checkstatus;
		this.checktime = checktime;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
		this.tenantcode = tenantcode;
		this.issyn = issyn;
		this.syntime = syntime;
	}
}