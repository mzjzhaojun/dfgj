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
public class Consultbranchperfdaysum implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long regionid;
	Long branchid;
	Integer year;
	Integer month;
	Integer day;
	Object moneycount;
	Integer peoplecount;
	Object newmoneycount;
	Integer newpeoplecount;
	java.util.Date createtime;

	public Consultbranchperfdaysum() {
	}

	public Consultbranchperfdaysum(Long id, Integer version, Long regionid, Long branchid, Integer year, Integer month, Integer day,
			Object moneycount, Integer peoplecount, Object newmoneycount, Integer newpeoplecount, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.regionid = regionid;
		this.branchid = branchid;
		this.year = year;
		this.month = month;
		this.day = day;
		this.moneycount = moneycount;
		this.peoplecount = peoplecount;
		this.newmoneycount = newmoneycount;
		this.newpeoplecount = newpeoplecount;
		this.createtime = createtime;
	}
}