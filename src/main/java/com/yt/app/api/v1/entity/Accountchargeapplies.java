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
public class Accountchargeapplies implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	Long parentid;
	String parentname;
	Long customerid;
	String customercode;
	String customername;
	String customergrade;
	Long accountid;
	String accountcode;
	String applyno;
	String applystatus;
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
	String chargetype;
	String chargeflag;
	Object chargemoney;
	Object paidmoney;
	Long paystatus;
	java.util.Date paytime;
	java.util.Date swipetime;
	java.util.Date actualtime;
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
	Long auditorid;
	String auditorname;
	Long auditorjobid;
	String auditorjobname;
	String auditstatus;
	java.util.Date audittime;
	Integer auditstate1;
	Integer auditstate2;
	Integer auditstate3;
	Integer auditstate4;
	Integer auditstate5;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;
	String allotsubjects;
	Long paytype;
	String payticket;

	public Accountchargeapplies() {
	}

}