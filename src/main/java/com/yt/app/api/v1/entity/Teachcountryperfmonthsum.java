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
public class Teachcountryperfmonthsum implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Integer year;
	Integer month;
	Object hourcount;
	Object hourcounttask;
	Object renewalmoney;
	Object refundmoney;
	Object onetoonehourcount;
	Object grouphourcount;
	java.util.Date createtime;

	public Teachcountryperfmonthsum() {
	}

	public Teachcountryperfmonthsum(Long id, Integer version, Integer year, Integer month, Object hourcount, Object hourcounttask,
			Object renewalmoney, Object refundmoney, Object onetoonehourcount, Object grouphourcount, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.year = year;
		this.month = month;
		this.hourcount = hourcount;
		this.hourcounttask = hourcounttask;
		this.renewalmoney = renewalmoney;
		this.refundmoney = refundmoney;
		this.onetoonehourcount = onetoonehourcount;
		this.grouphourcount = grouphourcount;
		this.createtime = createtime;
	}
}