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
public class Chargereport implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long snapshotid;
	String statdatekey;
	String statdatename;
	String regionid;
	String regionname;
	String branchid;
	String branchname;
	String campusid;
	String campusname;
	Integer campusage;
	String staffid;
	String staffoaname;
	String staffjobtype;
	String staffjobname;
	Integer staffage;
	String grade;
	String gradename;
	String chargetype;
	String chargetypename;
	Object chargemoney;
	Object lastchargemoney;
	Object chargemoneydiff;
	Object chargemoneyratio;
	Object chargepeople;
	Object lastchargepeople;
	Object chargepeoplediff;
	Object chargepeopleratio;
	Object chargeaverage;
	Object lastchargeaverage;
	Object chargeaveragediff;
	Object chargeaverageratio;

	public Chargereport() {
	}

	public Chargereport(Long id, Integer version, Long snapshotid, String statdatekey, String statdatename, String regionid, String regionname,
			String branchid, String branchname, String campusid, String campusname, Integer campusage, String staffid, String staffoaname,
			String staffjobtype, String staffjobname, Integer staffage, String grade, String gradename, String chargetype, String chargetypename,
			Object chargemoney, Object lastchargemoney, Object chargemoneydiff, Object chargemoneyratio, Object chargepeople,
			Object lastchargepeople, Object chargepeoplediff, Object chargepeopleratio, Object chargeaverage, Object lastchargeaverage,
			Object chargeaveragediff, Object chargeaverageratio) {
		this.id = id;
		this.version = version;
		this.snapshotid = snapshotid;
		this.statdatekey = statdatekey;
		this.statdatename = statdatename;
		this.regionid = regionid;
		this.regionname = regionname;
		this.branchid = branchid;
		this.branchname = branchname;
		this.campusid = campusid;
		this.campusname = campusname;
		this.campusage = campusage;
		this.staffid = staffid;
		this.staffoaname = staffoaname;
		this.staffjobtype = staffjobtype;
		this.staffjobname = staffjobname;
		this.staffage = staffage;
		this.grade = grade;
		this.gradename = gradename;
		this.chargetype = chargetype;
		this.chargetypename = chargetypename;
		this.chargemoney = chargemoney;
		this.lastchargemoney = lastchargemoney;
		this.chargemoneydiff = chargemoneydiff;
		this.chargemoneyratio = chargemoneyratio;
		this.chargepeople = chargepeople;
		this.lastchargepeople = lastchargepeople;
		this.chargepeoplediff = chargepeoplediff;
		this.chargepeopleratio = chargepeopleratio;
		this.chargeaverage = chargeaverage;
		this.lastchargeaverage = lastchargeaverage;
		this.chargeaveragediff = chargeaveragediff;
		this.chargeaverageratio = chargeaverageratio;
	}
}