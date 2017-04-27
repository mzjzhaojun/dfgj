package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */
@Getter
@Setter
public class Accountrefundallots implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long applyid;
	Long teacherid;
	String teachername;
	Long teacheroacode;
	Long teacherjobid;
	String teacherjobname;
	Integer isfulltimeteacher;
	Long subject;
	String categorytype;
	Object allotamount;
	Object allotmoney;

	public Accountrefundallots() {
	}

	public Accountrefundallots(Long id, Integer version, Long applyid, Long teacherid, String teachername, Long teacheroacode, Long teacherjobid,
			String teacherjobname, Integer isfulltimeteacher, Long subject, String categorytype, Object allotamount, Object allotmoney) {
		this.id = id;
		this.version = version;
		this.applyid = applyid;
		this.teacherid = teacherid;
		this.teachername = teachername;
		this.teacheroacode = teacheroacode;
		this.teacherjobid = teacherjobid;
		this.teacherjobname = teacherjobname;
		this.isfulltimeteacher = isfulltimeteacher;
		this.subject = subject;
		this.categorytype = categorytype;
		this.allotamount = allotamount;
		this.allotmoney = allotmoney;
	}
}