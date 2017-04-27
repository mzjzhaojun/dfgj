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
public class Customerteacherassignapplies implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long customerteacherrelationid;
	String applytype;
	Long campusid;
	String campusname;
	Long customerid;
	Long oldteacherid;
	Long oldteacherjobid;
	String oldteacherjobname;
	String oldteacheroacode;
	String oldteachername;
	Long oldteacherjoborgid;
	String oldteacherjoborgname;
	Integer oldisfulltimeteacher;
	Long newteacherid;
	Long newteacherjobid;
	String newteacherjobname;
	String newteacheroacode;
	String newteachername;
	Long newteacherjoborgid;
	String newteacherjoborgname;
	Integer newisfulltimeteacher;
	String reason;
	String reasondescription;
	String status;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long tenantcode;

	public Customerteacherassignapplies() {
	}

	public Customerteacherassignapplies(Long id, Integer version, Long customerteacherrelationid, String applytype, Long campusid, String campusname,
			Long customerid, Long oldteacherid, Long oldteacherjobid, String oldteacherjobname, String oldteacheroacode, String oldteachername,
			Long oldteacherjoborgid, String oldteacherjoborgname, Integer oldisfulltimeteacher, Long newteacherid, Long newteacherjobid,
			String newteacherjobname, String newteacheroacode, String newteachername, Long newteacherjoborgid, String newteacherjoborgname,
			Integer newisfulltimeteacher, String reason, String reasondescription, String status, Long creatorid, String creatorname,
			java.util.Date createtime, Long tenantcode) {
		this.id = id;
		this.version = version;
		this.customerteacherrelationid = customerteacherrelationid;
		this.applytype = applytype;
		this.campusid = campusid;
		this.campusname = campusname;
		this.customerid = customerid;
		this.oldteacherid = oldteacherid;
		this.oldteacherjobid = oldteacherjobid;
		this.oldteacherjobname = oldteacherjobname;
		this.oldteacheroacode = oldteacheroacode;
		this.oldteachername = oldteachername;
		this.oldteacherjoborgid = oldteacherjoborgid;
		this.oldteacherjoborgname = oldteacherjoborgname;
		this.oldisfulltimeteacher = oldisfulltimeteacher;
		this.newteacherid = newteacherid;
		this.newteacherjobid = newteacherjobid;
		this.newteacherjobname = newteacherjobname;
		this.newteacheroacode = newteacheroacode;
		this.newteachername = newteachername;
		this.newteacherjoborgid = newteacherjoborgid;
		this.newteacherjoborgname = newteacherjoborgname;
		this.newisfulltimeteacher = newisfulltimeteacher;
		this.reason = reason;
		this.reasondescription = reasondescription;
		this.status = status;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.tenantcode = tenantcode;
	}
}