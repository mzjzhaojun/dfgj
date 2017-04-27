package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:46
 */
@Getter
@Setter
public class Accounttransferapplies implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String applyno;
	String applystatus;
	String applymemo;
	java.util.Date applytime;
	Long applierid;
	String appliername;
	Long applierjobid;
	String applierjobname;
	String processstatus;
	java.util.Date processtime;
	String processmemo;
	String transfertype;
	Object transfermoney;
	Long submitterid;
	String submittername;
	Long submitterjobid;
	String submitterjobname;
	java.util.Date submittime;
	Long approverid;
	String approvername;
	Long approverjobid;
	String approverjobname;
	java.util.Date approvetime;
	Long campusid;
	String campusname;
	Long customerid;
	String customercode;
	String customername;
	Long accountid;
	String accountcode;
	String accounttype;
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
	Long bizcampusid;
	String bizcampusname;
	Long bizcustomerid;
	String bizcustomercode;
	String bizcustomername;
	Long bizaccountid;
	String bizaccountcode;
	String bizaccounttype;
	Long bizthatdiscountid;
	String bizthatdiscountcode;
	Object bizthatdiscountbase;
	Object bizthatdiscountrate;
	Object bizthataccountvalue;
	Object bizthataccountmoney;
	Long bizthisdiscountid;
	String bizthisdiscountcode;
	Object bizthisdiscountbase;
	Object bizthisdiscountrate;
	Object bizthisaccountvalue;
	Object bizthisaccountmoney;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Accounttransferapplies() {
	}

	public Accounttransferapplies(Long id, Integer version, String applyno, String applystatus, String applymemo, java.util.Date applytime,
			Long applierid, String appliername, Long applierjobid, String applierjobname, String processstatus, java.util.Date processtime,
			String processmemo, String transfertype, Object transfermoney, Long submitterid, String submittername, Long submitterjobid,
			String submitterjobname, java.util.Date submittime, Long approverid, String approvername, Long approverjobid, String approverjobname,
			java.util.Date approvetime, Long campusid, String campusname, Long customerid, String customercode, String customername, Long accountid,
			String accountcode, String accounttype, Long thatdiscountid, String thatdiscountcode, Object thatdiscountbase, Object thatdiscountrate,
			Object thataccountvalue, Object thataccountmoney, Long thisdiscountid, String thisdiscountcode, Object thisdiscountbase,
			Object thisdiscountrate, Object thisaccountvalue, Object thisaccountmoney, Long bizcampusid, String bizcampusname, Long bizcustomerid,
			String bizcustomercode, String bizcustomername, Long bizaccountid, String bizaccountcode, String bizaccounttype, Long bizthatdiscountid,
			String bizthatdiscountcode, Object bizthatdiscountbase, Object bizthatdiscountrate, Object bizthataccountvalue,
			Object bizthataccountmoney, Long bizthisdiscountid, String bizthisdiscountcode, Object bizthisdiscountbase, Object bizthisdiscountrate,
			Object bizthisaccountvalue, Object bizthisaccountmoney, Long creatorid, String creatorname, java.util.Date createtime, Long modifierid,
			String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.applyno = applyno;
		this.applystatus = applystatus;
		this.applymemo = applymemo;
		this.applytime = applytime;
		this.applierid = applierid;
		this.appliername = appliername;
		this.applierjobid = applierjobid;
		this.applierjobname = applierjobname;
		this.processstatus = processstatus;
		this.processtime = processtime;
		this.processmemo = processmemo;
		this.transfertype = transfertype;
		this.transfermoney = transfermoney;
		this.submitterid = submitterid;
		this.submittername = submittername;
		this.submitterjobid = submitterjobid;
		this.submitterjobname = submitterjobname;
		this.submittime = submittime;
		this.approverid = approverid;
		this.approvername = approvername;
		this.approverjobid = approverjobid;
		this.approverjobname = approverjobname;
		this.approvetime = approvetime;
		this.campusid = campusid;
		this.campusname = campusname;
		this.customerid = customerid;
		this.customercode = customercode;
		this.customername = customername;
		this.accountid = accountid;
		this.accountcode = accountcode;
		this.accounttype = accounttype;
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
		this.bizcampusid = bizcampusid;
		this.bizcampusname = bizcampusname;
		this.bizcustomerid = bizcustomerid;
		this.bizcustomercode = bizcustomercode;
		this.bizcustomername = bizcustomername;
		this.bizaccountid = bizaccountid;
		this.bizaccountcode = bizaccountcode;
		this.bizaccounttype = bizaccounttype;
		this.bizthatdiscountid = bizthatdiscountid;
		this.bizthatdiscountcode = bizthatdiscountcode;
		this.bizthatdiscountbase = bizthatdiscountbase;
		this.bizthatdiscountrate = bizthatdiscountrate;
		this.bizthataccountvalue = bizthataccountvalue;
		this.bizthataccountmoney = bizthataccountmoney;
		this.bizthisdiscountid = bizthisdiscountid;
		this.bizthisdiscountcode = bizthisdiscountcode;
		this.bizthisdiscountbase = bizthisdiscountbase;
		this.bizthisdiscountrate = bizthisdiscountrate;
		this.bizthisaccountvalue = bizthisaccountvalue;
		this.bizthisaccountmoney = bizthisaccountmoney;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}