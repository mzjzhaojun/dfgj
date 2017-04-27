package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */
@Getter
@Setter
public class Teachstaffperfmonthsum implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long regionid;
	Long branchid;
	Long campusid;
	Long groupid;
	Long staffid;
	Long staffjobid;
	Integer year;
	Integer month;
	Object hourcount;
	Object hourcounttask;
	Object renewalmoney;
	Object refundmoney;
	Object onetoonehourcount;
	Object onetoonecampusrank;
	Object onetoonebranchrank;
	Object onetoonecountryrank;
	Object grouphourcount;
	Object groupcampusrank;
	Object groupbranchrank;
	Object groupcountryrank;
	java.util.Date createtime;

	public Teachstaffperfmonthsum() {
	}

	public Teachstaffperfmonthsum(Long id, Integer version, Long regionid, Long branchid, Long campusid, Long groupid, Long staffid, Long staffjobid,
			Integer year, Integer month, Object hourcount, Object hourcounttask, Object renewalmoney, Object refundmoney, Object onetoonehourcount,
			Object onetoonecampusrank, Object onetoonebranchrank, Object onetoonecountryrank, Object grouphourcount, Object groupcampusrank,
			Object groupbranchrank, Object groupcountryrank, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.regionid = regionid;
		this.branchid = branchid;
		this.campusid = campusid;
		this.groupid = groupid;
		this.staffid = staffid;
		this.staffjobid = staffjobid;
		this.year = year;
		this.month = month;
		this.hourcount = hourcount;
		this.hourcounttask = hourcounttask;
		this.renewalmoney = renewalmoney;
		this.refundmoney = refundmoney;
		this.onetoonehourcount = onetoonehourcount;
		this.onetoonecampusrank = onetoonecampusrank;
		this.onetoonebranchrank = onetoonebranchrank;
		this.onetoonecountryrank = onetoonecountryrank;
		this.grouphourcount = grouphourcount;
		this.groupcampusrank = groupcampusrank;
		this.groupbranchrank = groupbranchrank;
		this.groupcountryrank = groupcountryrank;
		this.createtime = createtime;
	}
}