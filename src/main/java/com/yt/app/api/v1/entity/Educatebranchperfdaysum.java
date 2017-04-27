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
public class Educatebranchperfdaysum implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long regionid;
	Long branchid;
	Integer year;
	Integer month;
	Integer day;
	Integer onetoonehourcount;
	Object onetoonehourincome;
	Integer grouphourcount;
	Object grouphourincome;
	Object renewalmoney;
	Object refundmoney;
	java.util.Date createtime;

	public Educatebranchperfdaysum() {
	}

	public Educatebranchperfdaysum(Long id, Integer version, Long regionid, Long branchid, Integer year, Integer month, Integer day,
			Integer onetoonehourcount, Object onetoonehourincome, Integer grouphourcount, Object grouphourincome, Object renewalmoney,
			Object refundmoney, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.regionid = regionid;
		this.branchid = branchid;
		this.year = year;
		this.month = month;
		this.day = day;
		this.onetoonehourcount = onetoonehourcount;
		this.onetoonehourincome = onetoonehourincome;
		this.grouphourcount = grouphourcount;
		this.grouphourincome = grouphourincome;
		this.renewalmoney = renewalmoney;
		this.refundmoney = refundmoney;
		this.createtime = createtime;
	}
}