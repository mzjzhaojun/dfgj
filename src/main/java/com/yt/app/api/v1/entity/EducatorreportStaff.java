package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */
@Getter
@Setter
public class EducatorreportStaff implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long snapshotid;
	String regionid;
	String regionshortname;
	String branchid;
	String branchshortname;
	String campusid;
	String campusshortname;
	Integer campusage;
	String staffid;
	String staffname;
	String staffoacode;
	String staffoaname;
	Integer employmentperiod;
	Integer belongnumber;
	Integer managenumber;
	Integer availablenumber;
	Integer assignednumber;
	Integer classsuspendednumber;
	Integer schoolsuspendednumber;
	Integer refundmoneynumber;
	Integer classfinishednumber;
	Object renewsignmoney;
	Object renewsignmoneyvol;
	Object renewsignmoneydiffyoy;
	Object renewsignmoneyyoyrate;
	Object renewsignmoneytask;
	Object renewsignmoneytcr;
	Integer renewsignnumber;
	Integer renewsignnumbervol;
	Integer renewsignnumberyoydiff;
	Object renewsignnumberyoyrate;
	Integer renewsignnumberrask;
	Object renewsignnumbertcr;
	Object renewsignsingle;
	Object renewsignsinglevol;
	Object renewsignsingleyoydiff;
	Object renewsignsingleyoyrate;
	Object refundmoney;
	Object refundmoneyvol;
	Object refundmoneyyoydiff;
	Object refundmoneyyoyrate;
	Object refundmoneytask;
	Object refundmoneytcr;
	Integer refundnumber;
	Integer refundnumbervol;
	Integer refundnumberyoydiff;
	Object refundnumberyoyrate;
	Integer refundnumbertask;
	Object refundnumbertcr;
	Object assignnumber;
	Object assignnumbervol;
	Object assignnumberyoydiff;
	Object assignnumberyoyrate;
	Object assignnumbertask;
	Object assignnumbertcr;
	Object courseincome;
	Object courseincomevol;
	Object courseincomeyoydiff;
	Object courseincomeyoyrate;
	Integer attendnumber;
	Integer attendnumbervol;
	Integer attendnumberyoydiff;
	Object attendnumberyoyrate;
	Object attendnumberrate;
	Object classsuspendedrate;
	Object onetooneaveragehours;
	Object onetooneaverageassignedamount;
	Object availableaveragehours;
	Object availableaverageassignedamount;
	Object onetooneassignnumber;
	Object onetooneassignnumbervol;
	Object onetooneassignnumberyoydiff;
	Object onetooneassignnumberyoyrate;
	Object onetoonecourseincome;
	Object onetoonecourseincomevol;
	Object onetoonecourseincomeyoydiff;
	Object onetoonecourseincomeyoyrate;
	Integer onetooneattendnumber;
	Integer onetooneattendnumbervol;
	Integer onetooneattendnumberyoydiff;
	Object onetooneattendnumberyoyrate;
	Object classassignnumber;
	Object classassignnumbervol;
	Object classassignnumberyoydiff;
	Object classassignnumberyoyrate;
	Object classassignnumbertask;
	Object classassignnumbertcr;
	Object classcourseincome;
	Object classcourseincomevol;
	Object classcourseincomeyoydiff;
	Object classcourseincomeyoyrate;
	Integer classattendnumber;
	Integer classattendnumbervol;
	Integer classattendnumberyoydiff;
	Object classattendnumberyoyrate;
	Object renewrate;
	Object refundrate;
	Object lossrate;
	Object retainedrate;
	Integer referralnumber;
	Integer visitnumber;
	Integer meetingnumber;
	Integer replynumber;
	Object scorestatistics;

	public EducatorreportStaff() {
	}

	public EducatorreportStaff(Long id, Integer version, Long snapshotid, String regionid, String regionshortname, String branchid,
			String branchshortname, String campusid, String campusshortname, Integer campusage, String staffid, String staffname, String staffoacode,
			String staffoaname, Integer employmentperiod, Integer belongnumber, Integer managenumber, Integer availablenumber,
			Integer assignednumber, Integer classsuspendednumber, Integer schoolsuspendednumber, Integer refundmoneynumber,
			Integer classfinishednumber, Object renewsignmoney, Object renewsignmoneyvol, Object renewsignmoneydiffyoy, Object renewsignmoneyyoyrate,
			Object renewsignmoneytask, Object renewsignmoneytcr, Integer renewsignnumber, Integer renewsignnumbervol, Integer renewsignnumberyoydiff,
			Object renewsignnumberyoyrate, Integer renewsignnumberrask, Object renewsignnumbertcr, Object renewsignsingle, Object renewsignsinglevol,
			Object renewsignsingleyoydiff, Object renewsignsingleyoyrate, Object refundmoney, Object refundmoneyvol, Object refundmoneyyoydiff,
			Object refundmoneyyoyrate, Object refundmoneytask, Object refundmoneytcr, Integer refundnumber, Integer refundnumbervol,
			Integer refundnumberyoydiff, Object refundnumberyoyrate, Integer refundnumbertask, Object refundnumbertcr, Object assignnumber,
			Object assignnumbervol, Object assignnumberyoydiff, Object assignnumberyoyrate, Object assignnumbertask, Object assignnumbertcr,
			Object courseincome, Object courseincomevol, Object courseincomeyoydiff, Object courseincomeyoyrate, Integer attendnumber,
			Integer attendnumbervol, Integer attendnumberyoydiff, Object attendnumberyoyrate, Object attendnumberrate, Object classsuspendedrate,
			Object onetooneaveragehours, Object onetooneaverageassignedamount, Object availableaveragehours, Object availableaverageassignedamount,
			Object onetooneassignnumber, Object onetooneassignnumbervol, Object onetooneassignnumberyoydiff, Object onetooneassignnumberyoyrate,
			Object onetoonecourseincome, Object onetoonecourseincomevol, Object onetoonecourseincomeyoydiff, Object onetoonecourseincomeyoyrate,
			Integer onetooneattendnumber, Integer onetooneattendnumbervol, Integer onetooneattendnumberyoydiff, Object onetooneattendnumberyoyrate,
			Object classassignnumber, Object classassignnumbervol, Object classassignnumberyoydiff, Object classassignnumberyoyrate,
			Object classassignnumbertask, Object classassignnumbertcr, Object classcourseincome, Object classcourseincomevol,
			Object classcourseincomeyoydiff, Object classcourseincomeyoyrate, Integer classattendnumber, Integer classattendnumbervol,
			Integer classattendnumberyoydiff, Object classattendnumberyoyrate, Object renewrate, Object refundrate, Object lossrate,
			Object retainedrate, Integer referralnumber, Integer visitnumber, Integer meetingnumber, Integer replynumber, Object scorestatistics) {
		this.id = id;
		this.version = version;
		this.snapshotid = snapshotid;
		this.regionid = regionid;
		this.regionshortname = regionshortname;
		this.branchid = branchid;
		this.branchshortname = branchshortname;
		this.campusid = campusid;
		this.campusshortname = campusshortname;
		this.campusage = campusage;
		this.staffid = staffid;
		this.staffname = staffname;
		this.staffoacode = staffoacode;
		this.staffoaname = staffoaname;
		this.employmentperiod = employmentperiod;
		this.belongnumber = belongnumber;
		this.managenumber = managenumber;
		this.availablenumber = availablenumber;
		this.assignednumber = assignednumber;
		this.classsuspendednumber = classsuspendednumber;
		this.schoolsuspendednumber = schoolsuspendednumber;
		this.refundmoneynumber = refundmoneynumber;
		this.classfinishednumber = classfinishednumber;
		this.renewsignmoney = renewsignmoney;
		this.renewsignmoneyvol = renewsignmoneyvol;
		this.renewsignmoneydiffyoy = renewsignmoneydiffyoy;
		this.renewsignmoneyyoyrate = renewsignmoneyyoyrate;
		this.renewsignmoneytask = renewsignmoneytask;
		this.renewsignmoneytcr = renewsignmoneytcr;
		this.renewsignnumber = renewsignnumber;
		this.renewsignnumbervol = renewsignnumbervol;
		this.renewsignnumberyoydiff = renewsignnumberyoydiff;
		this.renewsignnumberyoyrate = renewsignnumberyoyrate;
		this.renewsignnumberrask = renewsignnumberrask;
		this.renewsignnumbertcr = renewsignnumbertcr;
		this.renewsignsingle = renewsignsingle;
		this.renewsignsinglevol = renewsignsinglevol;
		this.renewsignsingleyoydiff = renewsignsingleyoydiff;
		this.renewsignsingleyoyrate = renewsignsingleyoyrate;
		this.refundmoney = refundmoney;
		this.refundmoneyvol = refundmoneyvol;
		this.refundmoneyyoydiff = refundmoneyyoydiff;
		this.refundmoneyyoyrate = refundmoneyyoyrate;
		this.refundmoneytask = refundmoneytask;
		this.refundmoneytcr = refundmoneytcr;
		this.refundnumber = refundnumber;
		this.refundnumbervol = refundnumbervol;
		this.refundnumberyoydiff = refundnumberyoydiff;
		this.refundnumberyoyrate = refundnumberyoyrate;
		this.refundnumbertask = refundnumbertask;
		this.refundnumbertcr = refundnumbertcr;
		this.assignnumber = assignnumber;
		this.assignnumbervol = assignnumbervol;
		this.assignnumberyoydiff = assignnumberyoydiff;
		this.assignnumberyoyrate = assignnumberyoyrate;
		this.assignnumbertask = assignnumbertask;
		this.assignnumbertcr = assignnumbertcr;
		this.courseincome = courseincome;
		this.courseincomevol = courseincomevol;
		this.courseincomeyoydiff = courseincomeyoydiff;
		this.courseincomeyoyrate = courseincomeyoyrate;
		this.attendnumber = attendnumber;
		this.attendnumbervol = attendnumbervol;
		this.attendnumberyoydiff = attendnumberyoydiff;
		this.attendnumberyoyrate = attendnumberyoyrate;
		this.attendnumberrate = attendnumberrate;
		this.classsuspendedrate = classsuspendedrate;
		this.onetooneaveragehours = onetooneaveragehours;
		this.onetooneaverageassignedamount = onetooneaverageassignedamount;
		this.availableaveragehours = availableaveragehours;
		this.availableaverageassignedamount = availableaverageassignedamount;
		this.onetooneassignnumber = onetooneassignnumber;
		this.onetooneassignnumbervol = onetooneassignnumbervol;
		this.onetooneassignnumberyoydiff = onetooneassignnumberyoydiff;
		this.onetooneassignnumberyoyrate = onetooneassignnumberyoyrate;
		this.onetoonecourseincome = onetoonecourseincome;
		this.onetoonecourseincomevol = onetoonecourseincomevol;
		this.onetoonecourseincomeyoydiff = onetoonecourseincomeyoydiff;
		this.onetoonecourseincomeyoyrate = onetoonecourseincomeyoyrate;
		this.onetooneattendnumber = onetooneattendnumber;
		this.onetooneattendnumbervol = onetooneattendnumbervol;
		this.onetooneattendnumberyoydiff = onetooneattendnumberyoydiff;
		this.onetooneattendnumberyoyrate = onetooneattendnumberyoyrate;
		this.classassignnumber = classassignnumber;
		this.classassignnumbervol = classassignnumbervol;
		this.classassignnumberyoydiff = classassignnumberyoydiff;
		this.classassignnumberyoyrate = classassignnumberyoyrate;
		this.classassignnumbertask = classassignnumbertask;
		this.classassignnumbertcr = classassignnumbertcr;
		this.classcourseincome = classcourseincome;
		this.classcourseincomevol = classcourseincomevol;
		this.classcourseincomeyoydiff = classcourseincomeyoydiff;
		this.classcourseincomeyoyrate = classcourseincomeyoyrate;
		this.classattendnumber = classattendnumber;
		this.classattendnumbervol = classattendnumbervol;
		this.classattendnumberyoydiff = classattendnumberyoydiff;
		this.classattendnumberyoyrate = classattendnumberyoyrate;
		this.renewrate = renewrate;
		this.refundrate = refundrate;
		this.lossrate = lossrate;
		this.retainedrate = retainedrate;
		this.referralnumber = referralnumber;
		this.visitnumber = visitnumber;
		this.meetingnumber = meetingnumber;
		this.replynumber = replynumber;
		this.scorestatistics = scorestatistics;
	}
}