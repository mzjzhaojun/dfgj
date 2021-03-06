package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */
@Getter
@Setter
public class Customerassetsdetail implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Integer monthkey;
	java.util.Date statlocaldate;
	Long campusid;
	String categorytype;
	String grade;
	Long assetid;
	java.util.Date ordertime;
	Object amount;
	Object money;

	public Customerassetsdetail() {
	}

	public Customerassetsdetail(Long id, Integer version, Integer monthkey, java.util.Date statlocaldate, Long campusid, String categorytype,
			String grade, Long assetid, java.util.Date ordertime, Object amount, Object money) {
		this.id = id;
		this.version = version;
		this.monthkey = monthkey;
		this.statlocaldate = statlocaldate;
		this.campusid = campusid;
		this.categorytype = categorytype;
		this.grade = grade;
		this.assetid = assetid;
		this.ordertime = ordertime;
		this.amount = amount;
		this.money = money;
	}
}