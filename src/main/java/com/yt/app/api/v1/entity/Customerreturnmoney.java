package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */
@Getter
@Setter
public class Customerreturnmoney implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long customerid;
	Long campusid;
	java.util.Date statlocaldate;
	Long consultantid;
	Long educatorid;
	String grade;
	String gradename;
	String subjecttype;
	String subjecttypename;
	Object returnmoney;

	public Customerreturnmoney() {
	}

	public Customerreturnmoney(Long id, Integer version, Long customerid, Long campusid, java.util.Date statlocaldate, Long consultantid,
			Long educatorid, String grade, String gradename, String subjecttype, String subjecttypename, Object returnmoney) {
		this.id = id;
		this.version = version;
		this.customerid = customerid;
		this.campusid = campusid;
		this.statlocaldate = statlocaldate;
		this.consultantid = consultantid;
		this.educatorid = educatorid;
		this.grade = grade;
		this.gradename = gradename;
		this.subjecttype = subjecttype;
		this.subjecttypename = subjecttypename;
		this.returnmoney = returnmoney;
	}
}