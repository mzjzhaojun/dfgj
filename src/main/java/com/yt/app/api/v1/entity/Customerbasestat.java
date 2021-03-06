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
public class Customerbasestat implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Integer datekey;
	Long customerid;
	java.util.Date statlocaldate;
	Long campusid;
	Long consultantid;
	String consultantname;
	Long consultantoacode;
	Long educatorid;
	String educatorname;
	Long educatoroacode;
	Object newchargeamount;
	Object earlyendrenewamount;
	Object earlystudyrenew;
	Object laterendrenew;
	Object laterstudyrenew;
	Object earlyendrenewamountagain;
	Object totalrenewamount;
	Object totalnewchargeamount;
	Object totalchargeamount;
	Object dailynewchargeamount;
	Object dailyearlyendrenewamount;
	Object dailyearlystudyrenew;
	Object dailylaterendrenew;
	Object dailylaterstudyrenew;
	Object dailyearlyendrenewamountagain;
	Object dailytotalnewchargeamount;
	Object dailytotalchargeamount;
	Object regularinperiodrefundmoney;
	Object regularnotinperiodrefundmoney;
	Object regularrefundmoney;
	Object irregularinperiodrefundmoney;
	Object irregularnotinperiodrefundmoney;
	Object irregularrefundmoney;
	Object totalnormalrefundamount;
	Object extraregularinperiodrefundmoney;
	Object extraregularnotinperiodrefundmoney;
	Object extraregularrefundmoney;
	Object extrairregularinperiodrefundmoney;
	Object extrairregularnotinperiodrefundmoney;
	Object extrairregularrefundmoney;
	Object totalextrarefundamount;
	Object totalrefundamount;
	Object reallowancemoney;
	Object compensatemoney;
	java.util.Date lastestrefundverifytime;
	Long referralstaffid;
	Long referralcustomerid;
	String currentgrade;
	String entrancegrade;
	Object totalmoneytransferedout;
	Object totalmoneytransferedin;
	java.util.Date lastesttransferedintime;
	java.util.Date lastesttransferedouttime;
	java.util.Date lastestclasstime;
	java.util.Date lastestpaytime;
	java.util.Date earliestpaytime;
	java.util.Date verifytime;
	java.util.Date replytime;
	java.util.Date visittime;
	java.util.Date meetingtime;
	String studentstatus;
	Integer graduated;
	Object accountvalue;
	Object accountmoney;
	Object accountpriceandamount;
	Object onetooneamountinasset;
	Object classgroupamountinasset;
	Object youxueamountinasset;
	Object otheramountinasset;
	Object totalamountinasset;
	Object lessondurationvalue;
	Object onetooneassignedincome;
	Object classgroupassignedincome;
	Object assignedincome;
	Object youxueincome;
	Object otherproductincome;
	Object otherincome;
	Object assignedamount;
	Object assignedavgunitprice;
	Object assigneddurationhours;
	java.util.Date onetoonecoursetime;
	java.util.Date classgroupcoursetime;
	java.util.Date youxuecoursetime;
	java.util.Date othercoursetime;
	Object orderavgunitprice;
	Object orderrealamount;
	Object orderlessonhours;
	Object ordertotalprice;
	Object debookamount;
	Object debookmoney;
	Object debooklessonhours;
	Object returnedmoney;
	Integer isavailable;
	Integer isclasssuspended;
	Integer isactive;
	Integer isschoolsuspended;
	Integer isclassfinished;

	public Customerbasestat() {
	}

	public Customerbasestat(Long id, Integer version, Integer datekey, Long customerid, java.util.Date statlocaldate, Long campusid,
			Long consultantid, String consultantname, Long consultantoacode, Long educatorid, String educatorname, Long educatoroacode,
			Object newchargeamount, Object earlyendrenewamount, Object earlystudyrenew, Object laterendrenew, Object laterstudyrenew,
			Object earlyendrenewamountagain, Object totalrenewamount, Object totalnewchargeamount, Object totalchargeamount,
			Object dailynewchargeamount, Object dailyearlyendrenewamount, Object dailyearlystudyrenew, Object dailylaterendrenew,
			Object dailylaterstudyrenew, Object dailyearlyendrenewamountagain, Object dailytotalnewchargeamount, Object dailytotalchargeamount,
			Object regularinperiodrefundmoney, Object regularnotinperiodrefundmoney, Object regularrefundmoney, Object irregularinperiodrefundmoney,
			Object irregularnotinperiodrefundmoney, Object irregularrefundmoney, Object totalnormalrefundamount,
			Object extraregularinperiodrefundmoney, Object extraregularnotinperiodrefundmoney, Object extraregularrefundmoney,
			Object extrairregularinperiodrefundmoney, Object extrairregularnotinperiodrefundmoney, Object extrairregularrefundmoney,
			Object totalextrarefundamount, Object totalrefundamount, Object reallowancemoney, Object compensatemoney,
			java.util.Date lastestrefundverifytime, Long referralstaffid, Long referralcustomerid, String currentgrade, String entrancegrade,
			Object totalmoneytransferedout, Object totalmoneytransferedin, java.util.Date lastesttransferedintime,
			java.util.Date lastesttransferedouttime, java.util.Date lastestclasstime, java.util.Date lastestpaytime, java.util.Date earliestpaytime,
			java.util.Date verifytime, java.util.Date replytime, java.util.Date visittime, java.util.Date meetingtime, String studentstatus,
			Integer graduated, Object accountvalue, Object accountmoney, Object accountpriceandamount, Object onetooneamountinasset,
			Object classgroupamountinasset, Object youxueamountinasset, Object otheramountinasset, Object totalamountinasset,
			Object lessondurationvalue, Object onetooneassignedincome, Object classgroupassignedincome, Object assignedincome, Object youxueincome,
			Object otherproductincome, Object otherincome, Object assignedamount, Object assignedavgunitprice, Object assigneddurationhours,
			java.util.Date onetoonecoursetime, java.util.Date classgroupcoursetime, java.util.Date youxuecoursetime, java.util.Date othercoursetime,
			Object orderavgunitprice, Object orderrealamount, Object orderlessonhours, Object ordertotalprice, Object debookamount,
			Object debookmoney, Object debooklessonhours, Object returnedmoney, Integer isavailable, Integer isclasssuspended, Integer isactive,
			Integer isschoolsuspended, Integer isclassfinished) {
		this.id = id;
		this.version = version;
		this.datekey = datekey;
		this.customerid = customerid;
		this.statlocaldate = statlocaldate;
		this.campusid = campusid;
		this.consultantid = consultantid;
		this.consultantname = consultantname;
		this.consultantoacode = consultantoacode;
		this.educatorid = educatorid;
		this.educatorname = educatorname;
		this.educatoroacode = educatoroacode;
		this.newchargeamount = newchargeamount;
		this.earlyendrenewamount = earlyendrenewamount;
		this.earlystudyrenew = earlystudyrenew;
		this.laterendrenew = laterendrenew;
		this.laterstudyrenew = laterstudyrenew;
		this.earlyendrenewamountagain = earlyendrenewamountagain;
		this.totalrenewamount = totalrenewamount;
		this.totalnewchargeamount = totalnewchargeamount;
		this.totalchargeamount = totalchargeamount;
		this.dailynewchargeamount = dailynewchargeamount;
		this.dailyearlyendrenewamount = dailyearlyendrenewamount;
		this.dailyearlystudyrenew = dailyearlystudyrenew;
		this.dailylaterendrenew = dailylaterendrenew;
		this.dailylaterstudyrenew = dailylaterstudyrenew;
		this.dailyearlyendrenewamountagain = dailyearlyendrenewamountagain;
		this.dailytotalnewchargeamount = dailytotalnewchargeamount;
		this.dailytotalchargeamount = dailytotalchargeamount;
		this.regularinperiodrefundmoney = regularinperiodrefundmoney;
		this.regularnotinperiodrefundmoney = regularnotinperiodrefundmoney;
		this.regularrefundmoney = regularrefundmoney;
		this.irregularinperiodrefundmoney = irregularinperiodrefundmoney;
		this.irregularnotinperiodrefundmoney = irregularnotinperiodrefundmoney;
		this.irregularrefundmoney = irregularrefundmoney;
		this.totalnormalrefundamount = totalnormalrefundamount;
		this.extraregularinperiodrefundmoney = extraregularinperiodrefundmoney;
		this.extraregularnotinperiodrefundmoney = extraregularnotinperiodrefundmoney;
		this.extraregularrefundmoney = extraregularrefundmoney;
		this.extrairregularinperiodrefundmoney = extrairregularinperiodrefundmoney;
		this.extrairregularnotinperiodrefundmoney = extrairregularnotinperiodrefundmoney;
		this.extrairregularrefundmoney = extrairregularrefundmoney;
		this.totalextrarefundamount = totalextrarefundamount;
		this.totalrefundamount = totalrefundamount;
		this.reallowancemoney = reallowancemoney;
		this.compensatemoney = compensatemoney;
		this.lastestrefundverifytime = lastestrefundverifytime;
		this.referralstaffid = referralstaffid;
		this.referralcustomerid = referralcustomerid;
		this.currentgrade = currentgrade;
		this.entrancegrade = entrancegrade;
		this.totalmoneytransferedout = totalmoneytransferedout;
		this.totalmoneytransferedin = totalmoneytransferedin;
		this.lastesttransferedintime = lastesttransferedintime;
		this.lastesttransferedouttime = lastesttransferedouttime;
		this.lastestclasstime = lastestclasstime;
		this.lastestpaytime = lastestpaytime;
		this.earliestpaytime = earliestpaytime;
		this.verifytime = verifytime;
		this.replytime = replytime;
		this.visittime = visittime;
		this.meetingtime = meetingtime;
		this.studentstatus = studentstatus;
		this.graduated = graduated;
		this.accountvalue = accountvalue;
		this.accountmoney = accountmoney;
		this.accountpriceandamount = accountpriceandamount;
		this.onetooneamountinasset = onetooneamountinasset;
		this.classgroupamountinasset = classgroupamountinasset;
		this.youxueamountinasset = youxueamountinasset;
		this.otheramountinasset = otheramountinasset;
		this.totalamountinasset = totalamountinasset;
		this.lessondurationvalue = lessondurationvalue;
		this.onetooneassignedincome = onetooneassignedincome;
		this.classgroupassignedincome = classgroupassignedincome;
		this.assignedincome = assignedincome;
		this.youxueincome = youxueincome;
		this.otherproductincome = otherproductincome;
		this.otherincome = otherincome;
		this.assignedamount = assignedamount;
		this.assignedavgunitprice = assignedavgunitprice;
		this.assigneddurationhours = assigneddurationhours;
		this.onetoonecoursetime = onetoonecoursetime;
		this.classgroupcoursetime = classgroupcoursetime;
		this.youxuecoursetime = youxuecoursetime;
		this.othercoursetime = othercoursetime;
		this.orderavgunitprice = orderavgunitprice;
		this.orderrealamount = orderrealamount;
		this.orderlessonhours = orderlessonhours;
		this.ordertotalprice = ordertotalprice;
		this.debookamount = debookamount;
		this.debookmoney = debookmoney;
		this.debooklessonhours = debooklessonhours;
		this.returnedmoney = returnedmoney;
		this.isavailable = isavailable;
		this.isclasssuspended = isclasssuspended;
		this.isactive = isactive;
		this.isschoolsuspended = isschoolsuspended;
		this.isclassfinished = isclassfinished;
	}
}