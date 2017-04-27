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
public class Customercourses implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long customerid;
	Long campusid;
	java.util.Date statlocaldate;
	String coursetype;
	Long teacherid;
	Long educatorid;
	Object assignedamount;
	Object lessondurationvalue;
	Object assignedincome;

	public Customercourses() {
	}

	public Customercourses(Long id, Integer version, Long customerid, Long campusid, java.util.Date statlocaldate, String coursetype, Long teacherid,
			Long educatorid, Object assignedamount, Object lessondurationvalue, Object assignedincome) {
		this.id = id;
		this.version = version;
		this.customerid = customerid;
		this.campusid = campusid;
		this.statlocaldate = statlocaldate;
		this.coursetype = coursetype;
		this.teacherid = teacherid;
		this.educatorid = educatorid;
		this.assignedamount = assignedamount;
		this.lessondurationvalue = lessondurationvalue;
		this.assignedincome = assignedincome;
	}
}