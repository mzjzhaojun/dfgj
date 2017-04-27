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
public class Customerservices implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long branchid;
	String branchname;
	Long campusid;
	String campusname;
	Long customerid;
	String customerkind;
	String customercode;
	String customername;
	String servicetype;
	String servicestatus;
	String servicememo;
	java.util.Date accepttime;
	String acceptlimit;
	Object acceptlimitvalue;
	String acceptmemo;
	Long accepterid;
	String acceptername;
	Long accepterjobid;
	String accepterjobname;
	String appealmemo;
	Long consultantid;
	String consultantname;
	Long consultantjobid;
	String consultantjobname;
	Long educatorid;
	String educatorname;
	Long educatorjobid;
	String educatorjobname;
	String consulttype;
	String consultmemo;
	String complainttimes;
	String complaintlevel;
	String complaintupgrade;
	Integer isupgradehandle;
	Long handlerid;
	String handlername;
	String handlerjobname;
	String handlerjobtype;
	String handleadvice;
	Integer issendemail;
	String handleremail;
	Integer issendmessage;
	String handlerphone;
	java.util.Date calltime;
	Long voiceid;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Customerservices() {
	}

	public Customerservices(Long id, Integer version, Long branchid, String branchname, Long campusid, String campusname, Long customerid,
			String customerkind, String customercode, String customername, String servicetype, String servicestatus, String servicememo,
			java.util.Date accepttime, String acceptlimit, Object acceptlimitvalue, String acceptmemo, Long accepterid, String acceptername,
			Long accepterjobid, String accepterjobname, String appealmemo, Long consultantid, String consultantname, Long consultantjobid,
			String consultantjobname, Long educatorid, String educatorname, Long educatorjobid, String educatorjobname, String consulttype,
			String consultmemo, String complainttimes, String complaintlevel, String complaintupgrade, Integer isupgradehandle, Long handlerid,
			String handlername, String handlerjobname, String handlerjobtype, String handleadvice, Integer issendemail, String handleremail,
			Integer issendmessage, String handlerphone, java.util.Date calltime, Long voiceid, Long creatorid, String creatorname,
			java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.branchid = branchid;
		this.branchname = branchname;
		this.campusid = campusid;
		this.campusname = campusname;
		this.customerid = customerid;
		this.customerkind = customerkind;
		this.customercode = customercode;
		this.customername = customername;
		this.servicetype = servicetype;
		this.servicestatus = servicestatus;
		this.servicememo = servicememo;
		this.accepttime = accepttime;
		this.acceptlimit = acceptlimit;
		this.acceptlimitvalue = acceptlimitvalue;
		this.acceptmemo = acceptmemo;
		this.accepterid = accepterid;
		this.acceptername = acceptername;
		this.accepterjobid = accepterjobid;
		this.accepterjobname = accepterjobname;
		this.appealmemo = appealmemo;
		this.consultantid = consultantid;
		this.consultantname = consultantname;
		this.consultantjobid = consultantjobid;
		this.consultantjobname = consultantjobname;
		this.educatorid = educatorid;
		this.educatorname = educatorname;
		this.educatorjobid = educatorjobid;
		this.educatorjobname = educatorjobname;
		this.consulttype = consulttype;
		this.consultmemo = consultmemo;
		this.complainttimes = complainttimes;
		this.complaintlevel = complaintlevel;
		this.complaintupgrade = complaintupgrade;
		this.isupgradehandle = isupgradehandle;
		this.handlerid = handlerid;
		this.handlername = handlername;
		this.handlerjobname = handlerjobname;
		this.handlerjobtype = handlerjobtype;
		this.handleadvice = handleadvice;
		this.issendemail = issendemail;
		this.handleremail = handleremail;
		this.issendmessage = issendmessage;
		this.handlerphone = handlerphone;
		this.calltime = calltime;
		this.voiceid = voiceid;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}