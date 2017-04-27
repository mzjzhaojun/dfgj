package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class TeacherDaytask implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long regionid;
	Long branchid;
	Long campusid;
	String campusname;
	Long staffid;
	String staffoacode;
	String staffname;
	Long customerid;
	Long customercode;
	String customername;
	String customergrade;
	String studentstatus;
	String tasktype;
	Integer year;
	Integer month;
	Object d01;
	Object d02;
	Object d03;
	Object d04;
	Object d05;
	Object d06;
	Object d07;
	Object d08;
	Object d09;
	Object d10;
	Object d11;
	Object d12;
	Object d13;
	Object d14;
	Object d15;
	Object d16;
	Object d17;
	Object d18;
	Object d19;
	Object d20;
	Object d21;
	Object d22;
	Object d23;
	Object d24;
	Object d25;
	Object d26;
	Object d27;
	Object d28;
	Object d29;
	Object d30;
	Object d31;
	java.util.Date createtime;
	Long creatorid;
	String creatorname;
	String creatorjobname;
	java.util.Date modifytime;
	Long modifierid;
	String modifiername;
	String modifierjobname;

	public TeacherDaytask() {
	}

	public TeacherDaytask(Long id, Integer version, Long regionid, Long branchid, Long campusid, String campusname, Long staffid, String staffoacode,
			String staffname, Long customerid, Long customercode, String customername, String customergrade, String studentstatus, String tasktype,
			Integer year, Integer month, Object d01, Object d02, Object d03, Object d04, Object d05, Object d06, Object d07, Object d08, Object d09,
			Object d10, Object d11, Object d12, Object d13, Object d14, Object d15, Object d16, Object d17, Object d18, Object d19, Object d20,
			Object d21, Object d22, Object d23, Object d24, Object d25, Object d26, Object d27, Object d28, Object d29, Object d30, Object d31,
			java.util.Date createtime, Long creatorid, String creatorname, String creatorjobname, java.util.Date modifytime, Long modifierid,
			String modifiername, String modifierjobname) {
		this.id = id;
		this.version = version;
		this.regionid = regionid;
		this.branchid = branchid;
		this.campusid = campusid;
		this.campusname = campusname;
		this.staffid = staffid;
		this.staffoacode = staffoacode;
		this.staffname = staffname;
		this.customerid = customerid;
		this.customercode = customercode;
		this.customername = customername;
		this.customergrade = customergrade;
		this.studentstatus = studentstatus;
		this.tasktype = tasktype;
		this.year = year;
		this.month = month;
		this.d01 = d01;
		this.d02 = d02;
		this.d03 = d03;
		this.d04 = d04;
		this.d05 = d05;
		this.d06 = d06;
		this.d07 = d07;
		this.d08 = d08;
		this.d09 = d09;
		this.d10 = d10;
		this.d11 = d11;
		this.d12 = d12;
		this.d13 = d13;
		this.d14 = d14;
		this.d15 = d15;
		this.d16 = d16;
		this.d17 = d17;
		this.d18 = d18;
		this.d19 = d19;
		this.d20 = d20;
		this.d21 = d21;
		this.d22 = d22;
		this.d23 = d23;
		this.d24 = d24;
		this.d25 = d25;
		this.d26 = d26;
		this.d27 = d27;
		this.d28 = d28;
		this.d29 = d29;
		this.d30 = d30;
		this.d31 = d31;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.creatorjobname = creatorjobname;
		this.modifytime = modifytime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifierjobname = modifierjobname;
	}
}