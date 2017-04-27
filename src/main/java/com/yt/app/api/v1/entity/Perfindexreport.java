package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */
@Getter
@Setter
public class Perfindexreport implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long snapshotid;
	String regionid;
	String regionname;
	String branchid;
	String branchname;
	String campusid;
	String campusname;
	Integer campusage;
	Object availables;
	Object classpersons;
	Object renewpersons;
	Object finishpersons;
	Object refundpersons;
	Object suspendpersons;
	Object chargemoney;
	Object refundmoney;
	Object hours;
	Object classrate;
	Object renewrate;
	Object dropoutrate;
	Object refundrate;
	Object churnrate;
	Object suspendrate;
	Object hourpervalid;

	public Perfindexreport() {
	}

	public Perfindexreport(Long id, Integer version, Long snapshotid, String regionid, String regionname, String branchid, String branchname,
			String campusid, String campusname, Integer campusage, Object availables, Object classpersons, Object renewpersons, Object finishpersons,
			Object refundpersons, Object suspendpersons, Object chargemoney, Object refundmoney, Object hours, Object classrate, Object renewrate,
			Object dropoutrate, Object refundrate, Object churnrate, Object suspendrate, Object hourpervalid) {
		this.id = id;
		this.version = version;
		this.snapshotid = snapshotid;
		this.regionid = regionid;
		this.regionname = regionname;
		this.branchid = branchid;
		this.branchname = branchname;
		this.campusid = campusid;
		this.campusname = campusname;
		this.campusage = campusage;
		this.availables = availables;
		this.classpersons = classpersons;
		this.renewpersons = renewpersons;
		this.finishpersons = finishpersons;
		this.refundpersons = refundpersons;
		this.suspendpersons = suspendpersons;
		this.chargemoney = chargemoney;
		this.refundmoney = refundmoney;
		this.hours = hours;
		this.classrate = classrate;
		this.renewrate = renewrate;
		this.dropoutrate = dropoutrate;
		this.refundrate = refundrate;
		this.churnrate = churnrate;
		this.suspendrate = suspendrate;
		this.hourpervalid = hourpervalid;
	}
}